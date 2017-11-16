package com.tencent.mm.plugin.report.kvdata;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class log_13835
  extends com.tencent.mm.bm.a
{
  public int clientVersion_;
  public String currChatName_;
  public int device_;
  public int ds_;
  public int import_ds_;
  public LinkedList<IMBehavior> oplist_;
  public long time_stamp_;
  public long uin_;
  
  public log_13835()
  {
    GMTrace.i(10714601226240L, 79830);
    this.oplist_ = new LinkedList();
    GMTrace.o(10714601226240L, 79830);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10714735443968L, 79831);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.currChatName_ == null) {
        throw new b("Not all required fields were included: currChatName_");
      }
      paramVarArgs.fk(1, this.import_ds_);
      paramVarArgs.fk(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fk(4, this.device_);
      paramVarArgs.fk(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      if (this.currChatName_ != null) {
        paramVarArgs.e(7, this.currChatName_);
      }
      paramVarArgs.d(8, 8, this.oplist_);
      GMTrace.o(10714735443968L, 79831);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.import_ds_) + 0 + b.a.a.a.fh(2, this.ds_) + b.a.a.a.S(3, this.uin_) + b.a.a.a.fh(4, this.device_) + b.a.a.a.fh(5, this.clientVersion_) + b.a.a.a.S(6, this.time_stamp_);
      paramInt = i;
      if (this.currChatName_ != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.currChatName_);
      }
      i = b.a.a.a.c(8, 8, this.oplist_);
      GMTrace.o(10714735443968L, 79831);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.oplist_.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.currChatName_ == null) {
        throw new b("Not all required fields were included: currChatName_");
      }
      GMTrace.o(10714735443968L, 79831);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      log_13835 locallog_13835 = (log_13835)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(10714735443968L, 79831);
        return -1;
      case 1: 
        locallog_13835.import_ds_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10714735443968L, 79831);
        return 0;
      case 2: 
        locallog_13835.ds_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10714735443968L, 79831);
        return 0;
      case 3: 
        locallog_13835.uin_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(10714735443968L, 79831);
        return 0;
      case 4: 
        locallog_13835.device_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10714735443968L, 79831);
        return 0;
      case 5: 
        locallog_13835.clientVersion_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10714735443968L, 79831);
        return 0;
      case 6: 
        locallog_13835.time_stamp_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(10714735443968L, 79831);
        return 0;
      case 7: 
        locallog_13835.currChatName_ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(10714735443968L, 79831);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new IMBehavior();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((IMBehavior)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        locallog_13835.oplist_.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(10714735443968L, 79831);
      return 0;
    }
    GMTrace.o(10714735443968L, 79831);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\log_13835.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */