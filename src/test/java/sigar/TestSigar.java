package sigar;

import org.hyperic.sigar.Sigar;
import org.junit.Test;

public class TestSigar {
    @Test
    public void SigarPathTest()throws Exception{
        Sigar sigar = SigarUtil.sigar;
        double cpuUsedPerc = sigar.getCpuPerc().getCombined();//cpu
        double memUsed = sigar.getMem().getActualUsed();//mem
        double memTotal = sigar.getMem().getTotal();
        double memUsedPerc = sigar.getMem().getUsedPercent();
        String memUsedStr = String.format("%.2f", memUsed/1024/1024/1024)+"GB";// mem to string GB
        String memTotalStr = String.format("%.2f", memTotal/1024/1024/1024)+"GB";
        String memUsedPercStr = String.format("%.2f", memUsedPerc)+" %";
//        double diskUsed = sigar.getFileSystemUsage(PathKit.getWebRootPath()).getUsed();//disk
//        double diskTotal = sigar.getFileSystemUsage(PathKit.getWebRootPath()).getTotal();
//        double diskUsedPerc = sigar.getFileSystemUsage(PathKit.getWebRootPath()).getUsePercent();
//        String diskUsedStr = String.format("%.2f", diskUsed/1024/1024)+"GB";//disk to String GB
//        String diskTotalStr = String.format("%.2f", diskTotal/1024/1024)+"GB";
//        String diskUsedPercStr = String.format("%.2f", diskUsedPerc*100)+" %";
        String fqdn = sigar.getFQDN();//FQDN
        System.out.println(memUsedStr);
    }

}
