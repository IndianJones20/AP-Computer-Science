package Chapter7Projects;

public interface Lockable
{
	public void setKey(int key);

	public boolean lock(int key);

	public boolean unlock(int key);

	public boolean locked();
}
