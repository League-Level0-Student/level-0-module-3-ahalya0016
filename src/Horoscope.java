import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("What is your star sign?");
	if (x.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "Make a new plan for your finances today and find a better way of dealing with things."); }
	if (x.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "As The Moon enters your house today you have ups and downs of emotions, ride the rollercoaster."); }
	if (x.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You have strong energy for relationships today and youll do great when there's competition."); }
	if (x.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "As Venus enters your house today someone will challenge you, use words instead of weapons."); }
    if (x.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "As Mars leaves your house today youll realise that the little things can mean more than you'd think."); }
	if (x.equals("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Use your instincts today and keep supporting others, but accept that you can't please everyone."); }
	if (x.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "As things in your love life are confusing today and move fast, go with the flow and don't over think it."); }
	if (x.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "Examine how things in your work life are affecting other areas today, and find some balance."); }
	if (x.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "You have decisions to make today, some you can take time over but some need to be made quickly.");		}				
	if (x.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You have energy for your love life and relationship today, so use it to move forward.");	}					
	if (x.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "When you want to be with those who support you and make you happy today, make sure you are acting appropriately."); }						
	if (x.equals("Pisces")) {
			JOptionPane.showMessageDialog(null, "When others dance around the truth today, gently coax the answers out of them, speak carefully.");	}
	else { 
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
	}}

