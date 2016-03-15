public abstract class TV
{
    private boolean tvON;

    public void setTVON(boolean on)
    {
        tvON=on;
    }

    public boolean getTVON()
    {
        return tvON;
    }
    
    public abstract void tvType();
}
