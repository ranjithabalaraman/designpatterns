package behavioral.iterator;

public interface ChannelIterator {

	public boolean hasNext();

	public Channel next();

	public Channel currentItem();
}
