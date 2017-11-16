package com.tencent.recovery.option;

import com.tencent.recovery.config.Express;

public class ProcessOptions
{
  public int itI;
  public Express xPR;
  
  public static final class Builder
  {
    private int itI;
    public Express xPR;
    
    public final Builder cno()
    {
      this.itI = 10000;
      return this;
    }
    
    public final ProcessOptions cnp()
    {
      ProcessOptions localProcessOptions = new ProcessOptions();
      localProcessOptions.itI = this.itI;
      localProcessOptions.xPR = this.xPR;
      return localProcessOptions;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\option\ProcessOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */