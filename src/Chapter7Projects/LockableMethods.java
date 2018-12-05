package Chapter7Projects;

public class LockableMethods implements Lockable
{
	int KeyCode;
	@Override
	public void setKey(int key)
	{
		KeyCode = key;
	}

	@Override
	public boolean lock(int key)
	{
		if (key == KeyCode)
		{
			return true;
		}

		else
			return false;
	}

	@Override
	public boolean unlock(int key)
	{
		if (key == KeyCode)
		{
			return true;
		}

		else
			return false;
	}

	@Override
	public boolean locked()
	{
		if (this.lock(KeyCode) == true)
		{
			return true;
		}

		else
			return false;
	}

}
