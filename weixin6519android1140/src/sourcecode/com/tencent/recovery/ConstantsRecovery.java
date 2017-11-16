package com.tencent.recovery;

import com.tencent.recovery.config.Express;
import com.tencent.recovery.config.ExpressItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.option.ProcessOptions.Builder;
import java.util.ArrayList;
import java.util.List;

public class ConstantsRecovery
{
  public static final class DefaultCommonOptions
  {
    public static final CommonOptions xPd;
    
    static
    {
      CommonOptions.Builder localBuilder = new CommonOptions.Builder();
      localBuilder.lOv = "";
      localBuilder.clientVersion = "";
      localBuilder.xPH = "";
      localBuilder.xPL = "";
      localBuilder.xPM = "";
      xPd = localBuilder.cnm();
    }
  }
  
  public static final class DefaultExpress
  {
    public static final Express xPe = new Express();
    public static final Express xPf;
    public static final Express xPg;
    
    static
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(17, 1114112));
      xPe.df(localArrayList);
      xPf = new Express();
      localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(1, 1118208));
      xPf.df(localArrayList);
      xPg = new Express();
      localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(1, 1114112));
      xPg.df(localArrayList);
    }
  }
  
  public static final class DefaultProcessOptions
  {
    public static final ProcessOptions xPh;
    public static final ProcessOptions xPi;
    public static final ProcessOptions xPj;
    
    static
    {
      ProcessOptions.Builder localBuilder = new ProcessOptions.Builder();
      localBuilder.xPR = ConstantsRecovery.DefaultExpress.xPe;
      localBuilder.cno();
      xPh = localBuilder.cnp();
      localBuilder = new ProcessOptions.Builder();
      localBuilder.xPR = ConstantsRecovery.DefaultExpress.xPf;
      localBuilder.cno();
      xPi = localBuilder.cnp();
      localBuilder = new ProcessOptions.Builder();
      localBuilder.xPR = ConstantsRecovery.DefaultExpress.xPg;
      localBuilder.cno();
      xPj = localBuilder.cnp();
    }
  }
  
  public static final class IntentAction {}
  
  public static final class IntentKeys {}
  
  public static final class Message {}
  
  public static final class ProcessStage {}
  
  public static final class ProcessStartFlag {}
  
  public static final class ProcessStatus {}
  
  public static final class ReportType {}
  
  public static final class SpKeys {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\ConstantsRecovery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */