public abstract class TV
{
    private boolean tvON;
    
    TV(boolean n)
    {
        tvON = n ;
    }

    public boolean getTVON()
    {
        return tvON;
    }
    
    public void setTvOn(boolean n)
    {
        tvON =n;
    }
    
    public abstract String tvType();
    
    public String toString()
    {
        return "...Am I On? " + tvON;
    }
}
