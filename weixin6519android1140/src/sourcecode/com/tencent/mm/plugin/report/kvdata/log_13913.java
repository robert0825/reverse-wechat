package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;

public class log_13913
  extends com.tencent.mm.bm.a
{
  public int clientVersion_;
  public int device_;
  public int ds_;
  public String error_;
  public int import_ds_;
  public int scene_;
  public long time_stamp_;
  public long uin_;
  
  public log_13913()
  {
    GMTrace.i(10713795919872L, 79824);
    GMTrace.o(10713795919872L, 79824);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10713930137600L, 79825);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.import_ds_);
      paramVarArgs.fk(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fk(4, this.device_);
      paramVarArgs.fk(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      paramVarArgs.fk(7, this.scene_);
      if (this.error_ != null) {
        paramVarArgs.e(8, this.error_);
      }
      GMTrace.o(10713930137600L, 79825);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.import_ds_) + 0 + b.a.a.a.fh(2, this.ds_) + b.a.a.a.S(3, this.uin_) + b.a.a.a.fh(4, this.device_) + b.a.a.a.fh(5, this.clientVersion_) + b.a.a.a.S(6, this.time_stamp_) + b.a.a.a.fh(7, this.scene_);
      paramInt = i;
      if (this.error_ != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.error_);
      }
      GMTrace.o(10713930137600L, 79825);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(10713930137600L, 79825);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      log_13913 locallog_13913 = (log_13913)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(10713930137600L, 79825);
        return -1;
      case 1: 
        locallog_13913.import_ds_ = locala.yqV.nj();
        GMTrace.o(10713930137600L, 79825);
        return 0;
      case 2: 
        locallog_13913.ds_ = locala.yqV.nj();
        GMTrace.o(10713930137600L, 79825);
        return 0;
      case 3: 
        locallog_13913.uin_ = locala.yqV.nk();
        GMTrace.o(10713930137600L, 79825);
        return 0;
      case 4: 
        locallog_13913.device_ = locala.yqV.nj();
        GMTrace.o(10713930137600L, 79825);
        return 0;
      case 5: 
        locallog_13913.clientVersion_ = locala.yqV.nj();
        GMTrace.o(10713930137600L, 79825);
        return 0;
      case 6: 
        locallog_13913.time_stamp_ = locala.yqV.nk();
        GMTrace.o(10713930137600L, 79825);
        return 0;
      case 7: 
        locallog_13913.scene_ = locala.yqV.nj();
        GMTrace.o(10713930137600L, 79825);
        return 0;
      }
      locallog_13913.error_ = locala.yqV.readString();
      GMTrace.o(10713930137600L, 79825);
      return 0;
    }
    GMTrace.o(10713930137600L, 79825);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\log_13913.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */