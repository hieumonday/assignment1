package GUI_project;

import javax.swing.*;//hỗ trợ xây dựng giao diện người dùng (GUI) trong Java.
import javax.swing.table.DefaultTableModel;//Lớp giúp quản lý dữ liệu cho JTable
import java.awt.*;// hỗ trợ xây dựng bố cục giao diện.
import java.util.ArrayList;//lớp và interface để quản lý danh sách dữ liệu.
import java.util.List;

public class BankAccountManager extends JFrame {// tức nó đại diện cho một cửa sổ GUI.

    private JTextField txtAccountNumber, txtAccountName, txtBalance, txtAmount;
    //Các trường nhập liệu như số tài khoản, tên tài khoản, số dư, v.v
    private JTextField txtFullName, txtIDCard, txtPhoneNumber, txtAddress, txtEmail;
    private JButton btnAdd, btnEdit, btnDelete, btnFindById, btnFindHighestBalance, btnDeposit, btnWithdraw, btnShowHistory;
    // Các nút bấm để thực hiện các chức năng.
    private JTable table;//Bảng hiển thị danh sách tài khoản.
    private DefaultTableModel tableModel;// Quản lý dữ liệu hiển thị trong JTable
    private List<String> transactionHistory;//Danh sách lưu lịch sử giao dịch

    public BankAccountManager() {
        setTitle("Bank Account Manager");//Đặt tiêu đề
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Đóng ứng dụng khi người dùng tắt cửa sổ.
        setSize(800, 600);//Đặt kích thước cửa sổ
        setLocationRelativeTo(null);// Căn giữa cửa sổ trên màn hình

        transactionHistory = new ArrayList<>();
        // Panel for form inputs
        JPanel inputPanel = new JPanel(new GridLayout(9, 2, 10, 10));
        //Container chứa các thành phần giao diện
        //Bố cục lưới 9 hàng, 2 cột, khoảng cách 10 pixel giữa các phần tử
        inputPanel.setBorder(BorderFactory.createTitledBorder("Account Details"));
        //Đặt viền và tiêu đề cho panel
        inputPanel.add(new JLabel("Account Number:"));//Hiển thị nhãn "Account Number"
        txtAccountNumber = new JTextField(10);//Trường nhập liệu cho số tài khoản
        txtAccountNumber.setPreferredSize(new Dimension(150, 20));// Đặt kích thước ưa thích
        inputPanel.add(txtAccountNumber);

        inputPanel.add(new JLabel("Account Name:"));
        txtAccountName = new JTextField(10);
        inputPanel.add(txtAccountName);

        inputPanel.add(new JLabel("Balance:"));
        txtBalance = new JTextField(10);
        inputPanel.add(txtBalance);

        inputPanel.add(new JLabel("Full Name:"));
        txtFullName = new JTextField(10);
        inputPanel.add(txtFullName);

        inputPanel.add(new JLabel("ID Card/CCCD:"));
        txtIDCard = new JTextField(10);
        inputPanel.add(txtIDCard);

        inputPanel.add(new JLabel("Phone Number:"));
        txtPhoneNumber = new JTextField(10);
        inputPanel.add(txtPhoneNumber);

        inputPanel.add(new JLabel("Address:"));
        txtAddress = new JTextField(10);
        inputPanel.add(txtAddress);

        inputPanel.add(new JLabel("Email:"));
        txtEmail = new JTextField(10);
        inputPanel.add(txtEmail);

        inputPanel.add(new JLabel("Amount:"));
        txtAmount = new JTextField(10);
        inputPanel.add(txtAmount);

        // Tạo panel chứa các button
        JPanel buttonPanel = new JPanel(new GridLayout(2, 4, 10, 10));//Bố cục 2 hàng, 4 cột cho các nút
        btnAdd = new JButton("Add");
        btnEdit = new JButton("Edit");
        btnDelete = new JButton("Delete");
        btnFindById = new JButton("Find by ID");
        btnFindHighestBalance = new JButton("Find Highest Balance");
        btnDeposit = new JButton("Deposit");
        btnWithdraw = new JButton("Withdraw");
        btnShowHistory = new JButton("Show History");
        //JButton: Các nút để thực hiện chức năng như thêm, sửa, xóa tài khoản, nạp/rút tiền
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnFindById);
        buttonPanel.add(btnFindHighestBalance);
        buttonPanel.add(btnDeposit);
        buttonPanel.add(btnWithdraw);
        buttonPanel.add(btnShowHistory);
        //Thêm các nút vào buttonPanel
        tableModel = new DefaultTableModel(new String[]{"Account Number", "Account Name", "Balance", "Full Name", "ID Card/CCCD", "Phone Number", "Address", "Email"}, 0);
        //DefaultTableModel: Tạo cấu trúc bảng với các cột như số tài khoản, tên tài khoản, số dư, v.v.
        table = new JTable(tableModel);//JTable: Hiển thị bảng dữ liệu
        JScrollPane tableScrollPane = new JScrollPane(table);//JScrollPane: Thêm thanh cuộn cho bảng
        tableScrollPane.setBorder(BorderFactory.createTitledBorder("Accounts List"));

        // Add components to frame
        setLayout(new BorderLayout(10, 10));
        add(inputPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH); //BorderLayout: Sắp xếp giao diện theo vùng NORTH, CENTER, và SOUTH
        btnAdd.addActionListener(e -> addAccount());
        btnEdit.addActionListener(e -> editAccount());
        btnDelete.addActionListener(e -> deleteAccount());
        btnFindById.addActionListener(e -> findAccountById());
        btnFindHighestBalance.addActionListener(e -> findAccountWithHighestBalance());
        btnDeposit.addActionListener(e -> depositMoney());
        btnWithdraw.addActionListener(e -> withdrawMoney());
        btnShowHistory.addActionListener(e -> showTransactionHistory());
        //Gán các phương thức xử lý cho sự kiện khi nhấn nút
        // Button actions
    }
    private void addAccount() {
        String accountNumber = txtAccountNumber.getText();
        String accountName = txtAccountName.getText();
        String balance = txtBalance.getText();
        String fullName = txtFullName.getText();
        String idCard = txtIDCard.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();

        if (accountNumber.isEmpty() || accountName.isEmpty() || balance.isEmpty() || fullName.isEmpty() || idCard.isEmpty() || phoneNumber.isEmpty() || address.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tableModel.addRow(new Object[]{accountNumber, accountName, balance, fullName, idCard, phoneNumber, address, email});
        clearFields();
    }//Lấy dữ liệu từ các trường nhập, kiểm tra rỗng, và thêm vào bảng

    private void editAccount() {// Sửa thông tin hàng được chọn.
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String accountNumber = txtAccountNumber.getText();
        String accountName = txtAccountName.getText();
        String balance = txtBalance.getText();
        String fullName = txtFullName.getText();
        String idCard = txtIDCard.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();

        if (accountNumber.isEmpty() || accountName.isEmpty() || balance.isEmpty() || fullName.isEmpty() || idCard.isEmpty() || phoneNumber.isEmpty() || address.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tableModel.setValueAt(accountNumber, selectedRow, 0);
        tableModel.setValueAt(accountName, selectedRow, 1);
        tableModel.setValueAt(balance, selectedRow, 2);
        tableModel.setValueAt(fullName, selectedRow, 3);
        tableModel.setValueAt(idCard, selectedRow, 4);
        tableModel.setValueAt(phoneNumber, selectedRow, 5);
        tableModel.setValueAt(address, selectedRow, 6);
        tableModel.setValueAt(email, selectedRow, 7);
        clearFields();
    }

    private void deleteAccount() {//Xóa hàng được chọn.
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tableModel.removeRow(selectedRow);
         clearFields();
    }

    private void findAccountById() {//Tìm tài khoản theo số ID
        String accountId = txtAccountNumber.getText();
        if (accountId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an account number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 0).equals(accountId)) {
                table.setRowSelectionInterval(i, i);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Account not found", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void findAccountWithHighestBalance() {
        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No accounts available", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int highestBalanceRow = 0;
        double highestBalance = Double.parseDouble(tableModel.getValueAt(0, 2).toString());

        for (int i = 1; i < tableModel.getRowCount(); i++) {
            double balance = Double.parseDouble(tableModel.getValueAt(i, 2).toString());
            if (balance > highestBalance) {
                highestBalance = balance;
                highestBalanceRow = i;
            }
        }

        table.setRowSelectionInterval(highestBalanceRow, highestBalanceRow);
    }

    private void depositMoney() {//Lấy số tiền từ người dùng, cập nhật số dư, và lưu lịch sử giao dịch
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an account to deposit money", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String amountStr = txtAmount.getText();
        if (amountStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
            double currentBalance = Double.parseDouble(tableModel.getValueAt(selectedRow, 2).toString());
            double newBalance = currentBalance + amount;
            tableModel.setValueAt(newBalance, selectedRow, 2);
            transactionHistory.add("Deposited " + amount + " to account " + tableModel.getValueAt(selectedRow, 0));
            txtAmount.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void withdrawMoney() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an account to withdraw money", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String amountStr = txtAmount.getText();
        if (amountStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
            double currentBalance = Double.parseDouble(tableModel.getValueAt(selectedRow, 2).toString());
            if (amount > currentBalance) {
                JOptionPane.showMessageDialog(this, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double newBalance = currentBalance - amount;
            tableModel.setValueAt(newBalance, selectedRow, 2);
            transactionHistory.add("Withdrew " + amount + " from account " + tableModel.getValueAt(selectedRow, 0));
            txtAmount.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No transaction history available", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder history = new StringBuilder();
        for (String record : transactionHistory) {
            history.append(record).append("\n");
        }

        JTextArea textArea = new JTextArea(history.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(200, 150));

        JOptionPane.showMessageDialog(this, scrollPane, "Transaction History", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearFields() {
        txtAccountNumber.setText("");
        txtAccountName.setText("");
        txtBalance.setText("");
        txtFullName.setText("");
        txtIDCard.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtAmount.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BankAccountManager().setVisible(true);
        });
    }
    //SwingUtilities.invokeLater: Đảm bảo giao diện được tạo trên luồng sự kiện GUI
    //setVisible(true): Hiển thị cửa sổ
}
