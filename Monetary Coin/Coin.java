public class Coin implements Lockable
{
  private final int HEADS = 0;
  private final int TAILS = 1;
  private final int LOCK = 5;
  private int face;
  private int coinKey;
  private boolean locked = false;

  public Coin()
  {
  	locked = false;
  	coinKey = 0;
  	flip();
  }

  public void flip()
  {
    if (!locked)
    {
      face = (int) (Math.random() * 2);
    }
  }

  public boolean isHeads()
  {
    return (face == HEADS);
  }

  public String toString()
  {
    if (!locked)
    {
    	String faceName;

    	if(face == HEADS)
    	{
    		faceName = "HEADS";
    	}
    	else
    	{
    		faceName = "Tails";
    	}

    	return faceName;
    }
    else
    {
    	return "LOCKED";
    }
  }

  public void setKey(int key)
  {
  	if(!locked)
  	{
      coinKey = key;
    }
  }

  public void lock(int key)
  {
  	if(key == coinKey)
  	{
  		locked = true;
  	}
  }

  public void unlock(int key)
  {
  	if(key == coinKey)
  	{
  		locked = false;
  	}
  }

  public boolean locked()
  {
  	return locked;
  }
}
