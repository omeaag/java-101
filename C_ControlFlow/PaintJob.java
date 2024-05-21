package C_ControlFlow;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.5,2.3));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if(width<=0||height<=0||areaPerBucket<=0||extraBucket<0){
            return -1;
        }

        return (int) Math.ceil(width*height/areaPerBucket) - extraBucket;

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        return getBucketCount(width,height,areaPerBucket,0);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0||areaPerBucket<=0){
            return -1;
        }

        return getBucketCount(area,1,areaPerBucket);
    }

}
