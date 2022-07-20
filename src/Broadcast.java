import java.util.ArrayList;
import java.util.List;

public class Broadcast {

    int maxDuration;

    List<BroadcastItemInterface> items = new ArrayList<BroadcastItemInterface>();

    public void printReport() {

        for (int i = 0; i < items.size(); i++) {
            BroadcastItemInterface item = items.get(i);
            String report = "";

            report += item.getClass().getName() + " : duration : " + item.getDuration() + " : " + item.getTitle();

            if (item.isPaidContent()) {
                report += " : Paid content";
            } else {
                report += " : Free Content";
            }

            System.out.println(report);
        }
        System.out.println("Total paid content : " + this.getPaidContentDuration());
        System.out.println("Total items durations : " + this.getItemsDuration());
        System.out.println("Total free duration : " + this.getFreeDuration());
    }

    public int getPaidContentDuration() {
        int result = 0;
        for (int i = 0; i < items.size(); i++) {
            BroadcastItemInterface item = items.get(i);
            if (item.isPaidContent()) {
                result += item.getDuration();
            }
        }
        return result;
    }

    public int getMaxDuration() {
        return maxDuration;
    }


    public int getItemsDuration() {
        int result = 0;
        for (int i = 0; i < items.size(); i++) {
            result += items.get(i).getDuration();
        }
        return result;
    }

      public int getFreeDuration() {
        return maxDuration - this.getItemsDuration();
    }

        public boolean isCanBeAddPaidContent(int duration) {
        //@TODO : need add logic
        return true;
    }

    public boolean add(BroadcastItemInterface item) {
        //add logic with check total durations
        if (this.getItemsDuration() + item.getDuration() > maxDuration) {
            System.out.println("Not enough space for : " + item.getClass().getName() + " " + item.getTitle());
            return false;
        }

        if (item.isPaidContent() && !this.isCanBeAddPaidContent(item.getDuration())) {
            return false;
        }
        this.items.add(item);

        return true;
    }

}
