public class Main {
    public static void main(String[] args) {

        ChannelCollection channels = popuniKanale();
        ChannelIterator iter = channels.iterator(ChannelTypeEnum.ALL);

        while(iter.hasNext()){
            Channel c = iter.next();
            System.out.println(c);
        }

    }

    private static ChannelCollection popuniKanale(){

        ChannelCollection channels = new ChannelCollectionImpl();

        channels.addChannel(new Channel(98.5, ChannelTypeEnum.SERBIAN));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.SERBIAN));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.SERBIAN));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.SERBIAN));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.SERBIAN));

        return channels;
    }
}
