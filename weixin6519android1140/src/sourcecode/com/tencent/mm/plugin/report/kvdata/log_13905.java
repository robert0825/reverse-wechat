package com.tencent.mm.plugin.report.kvdata;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class log_13905
  extends com.tencent.mm.bm.a
{
  public int clientVersion_;
  public int device_;
  public int ds_;
  public int import_ds_;
  public long time_stamp_;
  public long uin_;
  public VoiceInputBehavior viOp_;
  
  public log_13905()
  {
    GMTrace.i(10714064355328L, 79826);
    GMTrace.o(10714064355328L, 79826);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10714198573056L, 79827);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.viOp_ == null) {
        throw new b("Not all required fields were included: viOp_");
      }
      paramVarArgs.fk(1, this.import_ds_);
      paramVarArgs.fk(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fk(4, this.device_);
      paramVarArgs.fk(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      if (this.viOp_ != null)
      {
        paramVarArgs.fm(7, this.viOp_.aYq());
        this.viOp_.a(paramVarArgs);
      }
      GMTrace.o(10714198573056L, 79827);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.import_ds_) + 0 + b.a.a.a.fh(2, this.ds_) + b.a.a.a.S(3, this.uin_) + b.a.a.a.fh(4, this.device_) + b.a.a.a.fh(5, this.clientVersion_) + b.a.a.a.S(6, this.time_stamp_);
      paramInt = i;
      if (this.viOp_ != null) {
        paramInt = i + b.a.a.a.fj(7, this.viOp_.aYq());
      }
      GMTrace.o(10714198573056L, 79827);
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
      if (this.viOp_ == null) {
        throw new b("Not all required fields were included: viOp_");
      }
      GMTrace.o(10714198573056L, 79827);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      log_13905 locallog_13905 = (log_13905)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(10714198573056L, 79827);
        return -1;
      case 1: 
        locallog_13905.import_ds_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10714198573056L, 79827);
        return 0;
      case 2: 
        locallog_13905.ds_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10714198573056L, 79827);
        return 0;
      case 3: 
        locallog_13905.uin_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(10714198573056L, 79827);
        return 0;
      case 4: 
        locallog_13905.device_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10714198573056L, 79827);
        return 0;
      case 5: 
        locallog_13905.clientVersion_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10714198573056L, 79827);
        return 0;
      case 6: 
        locallog_13905.time_stamp_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(10714198573056L, 79827);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new VoiceInputBehavior();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((VoiceInputBehavior)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        locallog_13905.viOp_ = ((VoiceInputBehavior)localObject1);
        paramInt += 1;
      }
      GMTrace.o(10714198573056L, 79827);
      return 0;
    }
    GMTrace.o(10714198573056L, 79827);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\log_13905.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */