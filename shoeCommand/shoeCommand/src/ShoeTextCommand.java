
public class ShoeTextCommand implements Command {

    Shoe shoe;
    public ShoeTextCommand(Shoe shoe)
    {
        this.shoe = shoe;
    }
    @Override
    public void execute() {
        shoe.shoeText();
    }
}
