package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;

public class log_13532
  extends com.tencent.mm.bm.a
{
  public int clientVersion_;
  public int device_;
  public int ds_;
  public int import_ds_;
  public long time_stamp_;
  public int type;
  public long uin_;
  
  public log_13532()
  {
    GMTrace.i(10714332790784L, 79828);
    GMTrace.o(10714332790784L, 79828);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10714467008512L, 79829);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.import_ds_);
      paramVarArgs.fk(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fk(4, this.device_);
      paramVarArgs.fk(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      paramVarArgs.fk(7, this.type);
      GMTrace.o(10714467008512L, 79829);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.import_ds_);
      int i = b.a.a.a.fh(2, this.ds_);
      int j = b.a.a.a.S(3, this.uin_);
      int k = b.a.a.a.fh(4, this.device_);
      int m = b.a.a.a.fh(5, this.clientVersion_);
      int n = b.a.a.a.S(6, this.time_stamp_);
      int i1 = b.a.a.a.fh(7, this.type);
      GMTrace.o(10714467008512L, 79829);
      return paramInt + 0 + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(10714467008512L, 79829);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      log_13532 locallog_13532 = (log_13532)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(10714467008512L, 79829);
        return -1;
      case 1: 
        locallog_13532.import_ds_ = locala.yqV.nj();
        GMTrace.o(10714467008512L, 79829);
        return 0;
      case 2: 
        locallog_13532.ds_ = locala.yqV.nj();
        GMTrace.o(10714467008512L, 79829);
        return 0;
      case 3: 
        locallog_13532.uin_ = locala.yqV.nk();
        GMTrace.o(10714467008512L, 79829);
        return 0;
      case 4: 
        locallog_13532.device_ = locala.yqV.nj();
        GMTrace.o(10714467008512L, 79829);
        return 0;
      case 5: 
        locallog_13532.clientVersion_ = locala.yqV.nj();
        GMTrace.o(10714467008512L, 79829);
        return 0;
      case 6: 
        locallog_13532.time_stamp_ = locala.yqV.nk();
        GMTrace.o(10714467008512L, 79829);
        return 0;
      }
      locallog_13532.type = locala.yqV.nj();
      GMTrace.o(10714467008512L, 79829);
      return 0;
    }
    GMTrace.o(10714467008512L, 79829);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\log_13532.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */