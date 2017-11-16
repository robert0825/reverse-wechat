package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Reporters
{
  public static PerformanceTracer.Visitor detail(AudioInformation paramAudioInformation, final Map<String, String> paramMap)
  {
    new PerformanceTracer.Visitor()
    {
      public final void visitSpeedCheck(List<PerformanceTracer.SpeedCheck> paramAnonymousList, PerformanceTracer.OverallInfo paramAnonymousOverallInfo)
      {
        File localFile = paramAnonymousOverallInfo.mediaFile;
        long l1 = Math.round(paramAnonymousOverallInfo.totalPcmToBePlayed / paramAnonymousOverallInfo.timeCostInMs);
        long l2 = this.val$audioInformation.getPlaySample();
        long l3 = this.val$audioInformation.getChannels();
        if (this.val$audioInformation.getBitDept() == 1) {}
        StringBuilder localStringBuilder;
        for (int i = 1;; i = 2)
        {
          double d1 = i * (l3 * l2) / 1000.0D;
          double d2 = l1 / d1;
          localStringBuilder = new StringBuilder("\n============== Info start ==============\n");
          localStringBuilder.append("媒体文件信息:\n");
          localStringBuilder.append("\t播放时间: ").append(new Date().toString()).append("\n");
          localStringBuilder.append("\t文件路径: ").append(localFile.getAbsolutePath()).append("\n");
          localStringBuilder.append("\t文件大小: ").append(localFile.length()).append("\n");
          localStringBuilder.append("\t音频类型: ").append(this.val$audioInformation.getAudioType().toString()).append("\n");
          localStringBuilder.append("\t文件采样率: ").append(this.val$audioInformation.getSampleRate()).append("\n");
          localStringBuilder.append("\t播放采样率: ").append(this.val$audioInformation.getPlaySample()).append("\n");
          localStringBuilder.append("\t位深: ").append(this.val$audioInformation.getBitDept()).append("\n");
          localStringBuilder.append("\t声道数: ").append(this.val$audioInformation.getChannels()).append("\n");
          localStringBuilder.append("\t时长: ").append(this.val$audioInformation.getDuration()).append("\n");
          localStringBuilder.append("\t平均码率: ").append(localFile.length() / this.val$audioInformation.getDuration() * 8L).append("\n");
          localStringBuilder.append("\n整体性能\n");
          localStringBuilder.append("\t总耗时 (ms): ").append(paramAnonymousOverallInfo.timeCostInMs).append("\n");
          localStringBuilder.append("\t播放PCM数据量 (byte): ").append(paramAnonymousOverallInfo.totalPcmToBePlayed).append("\n");
          localStringBuilder.append("\t总速度 (byte/ms): ").append(l1).append(" (").append(Math.round(d2)).append(" 倍于最低要求速度)\n");
          localStringBuilder.append("\t最低要求速度 (byte/ms): ").append(d1).append("\n");
          localStringBuilder.append("\n额外信息:");
          Iterator localIterator = paramMap.entrySet().iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            localStringBuilder.append("\n\t").append((String)localEntry.getKey()).append(": ").append((String)localEntry.getValue());
          }
        }
        localStringBuilder.append("\n");
        Reporters.generateDetailedPerformance(paramAnonymousList, localStringBuilder, paramAnonymousOverallInfo.timeCostInMs);
        localStringBuilder.append("============== Info end ==============");
        FileLogger.write(localStringBuilder, new File(localFile.getAbsolutePath() + ".perf"), false);
      }
    };
  }
  
  public static void generateDetailedPerformance(List<PerformanceTracer.SpeedCheck> paramList, StringBuilder paramStringBuilder, long paramLong)
  {
    paramStringBuilder.append("\n详细性能数据:\n");
    paramStringBuilder.append(String.format(Locale.getDefault(), "\t%15s%15s%15s%15s%15s", new Object[] { "名称", "平均速度(byte/ms)", "耗时(ms)", "数据量(byte)", "占总耗时比" }));
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      PerformanceTracer.SpeedCheck localSpeedCheck = (PerformanceTracer.SpeedCheck)paramList.next();
      paramStringBuilder.append("\n");
      paramStringBuilder.append(String.format(Locale.getDefault(), "\t%15s%15.0f%15.0f%15.0f%15d%15d%13.2f", new Object[] { localSpeedCheck.getName(), Double.valueOf(localSpeedCheck.getAvg()), Double.valueOf(localSpeedCheck.getMax()), Double.valueOf(localSpeedCheck.getMin()), Long.valueOf(localSpeedCheck.getTotalTimeMs()), Long.valueOf(localSpeedCheck.getTotalBufferLength()), Double.valueOf(localSpeedCheck.getTotalTimeMs() / paramLong) }));
    }
    paramStringBuilder.append("\n");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\perf\Reporters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */