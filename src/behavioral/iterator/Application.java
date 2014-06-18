package behavioral.iterator;

public class Application {

	public static void main(String[] args) {
		ChannelCollection channels = populateChannels();
		ChannelIterator baseIterator = channels.iterator();
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.getName());
		}
	}

	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ConcreteChannelCollection();
		channels.addChannel(new Channel("ESPN"));
		channels.addChannel(new Channel("NDTV"));
		channels.addChannel(new Channel("CNN IBN"));
		return channels;
	}

}
