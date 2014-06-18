package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChannelCollection implements ChannelCollection {

	private List<Channel> channelsList;

	public ConcreteChannelCollection() {
		channelsList = new ArrayList<>();
	}

	public void addChannel(Channel c) {
		this.channelsList.add(c);
	}

	public void removeChannel(Channel c) {
		this.channelsList.remove(c);
	}

	public ChannelIterator iterator() {
		return new ConcreteChannelIterator(this.channelsList);
	}

	private class ConcreteChannelIterator implements ChannelIterator {
		private List<Channel> channels;

		private int currentPos = 0;

		public ConcreteChannelIterator(List<Channel> channels) {
			this.channels = channels;
		}

		public boolean hasNext() {
			if (currentPos + 1 <= channels.size()) {
				return true;
			}
			return false;
		}

		public Channel next() {
			Channel channel = channels.get(currentPos);
			currentPos++;
			return channel;
		}

		public Channel currentItem() {
			return channels.get(currentPos);
		}
	}
}
