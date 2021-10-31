import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Digite um número desejado (1 a 12)\n e receba o mês correspondente",
                "Meses do ano", JOptionPane.INFORMATION_MESSAGE);

        String x = JOptionPane.showInputDialog(null, "Digite o número desejado:", "Meses do ano",
                JOptionPane.QUESTION_MESSAGE);

        int y = Integer.parseInt(x);

        if (y == 1) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Janeiro", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);

        } else if (y == 2) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Fevereiro", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 3) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Março", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 4) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Abril", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 5) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Maio", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 6) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Junho", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 7) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Julho", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 8) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Agosto", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 9) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Setembro", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 10) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Outubro", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 11) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Novembro", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (y == 12) {
            JOptionPane.showMessageDialog(null, "Número digitado " + y + ": Dezembro", "Meses do ano",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Número invalido", "Meses do ano", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}