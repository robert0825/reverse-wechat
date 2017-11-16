package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class log_14375
  extends com.tencent.mm.bm.a
{
  public int clientVersion_;
  public BDStatusInfo dbStatusInfo_;
  public int device_;
  public int ds_;
  public HeavyDetailInfo heavyDetailInfo_;
  public int import_ds_;
  public SDStatusInfo sdStatusInfo_;
  public long time_stamp_;
  public int type_;
  public long uin_;
  
  public log_14375()
  {
    GMTrace.i(17508299964416L, 130447);
    GMTrace.o(17508299964416L, 130447);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17508434182144L, 130448);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.import_ds_);
      paramVarArgs.fk(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fk(4, this.device_);
      paramVarArgs.fk(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      paramVarArgs.fk(7, this.type_);
      if (this.dbStatusInfo_ != null)
      {
        paramVarArgs.fm(8, this.dbStatusInfo_.aYq());
        this.dbStatusInfo_.a(paramVarArgs);
      }
      if (this.sdStatusInfo_ != null)
      {
        paramVarArgs.fm(9, this.sdStatusInfo_.aYq());
        this.sdStatusInfo_.a(paramVarArgs);
      }
      if (this.heavyDetailInfo_ != null)
      {
        paramVarArgs.fm(10, this.heavyDetailInfo_.aYq());
        this.heavyDetailInfo_.a(paramVarArgs);
      }
      GMTrace.o(17508434182144L, 130448);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.import_ds_) + 0 + b.a.a.a.fh(2, this.ds_) + b.a.a.a.S(3, this.uin_) + b.a.a.a.fh(4, this.device_) + b.a.a.a.fh(5, this.clientVersion_) + b.a.a.a.S(6, this.time_stamp_) + b.a.a.a.fh(7, this.type_);
      paramInt = i;
      if (this.dbStatusInfo_ != null) {
        paramInt = i + b.a.a.a.fj(8, this.dbStatusInfo_.aYq());
      }
      i = paramInt;
      if (this.sdStatusInfo_ != null) {
        i = paramInt + b.a.a.a.fj(9, this.sdStatusInfo_.aYq());
      }
      paramInt = i;
      if (this.heavyDetailInfo_ != null) {
        paramInt = i + b.a.a.a.fj(10, this.heavyDetailInfo_.aYq());
      }
      GMTrace.o(17508434182144L, 130448);
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
      GMTrace.o(17508434182144L, 130448);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      log_14375 locallog_14375 = (log_14375)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17508434182144L, 130448);
        return -1;
      case 1: 
        locallog_14375.import_ds_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508434182144L, 130448);
        return 0;
      case 2: 
        locallog_14375.ds_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508434182144L, 130448);
        return 0;
      case 3: 
        locallog_14375.uin_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508434182144L, 130448);
        return 0;
      case 4: 
        locallog_14375.device_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508434182144L, 130448);
        return 0;
      case 5: 
        locallog_14375.clientVersion_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508434182144L, 130448);
        return 0;
      case 6: 
        locallog_14375.time_stamp_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508434182144L, 130448);
        return 0;
      case 7: 
        locallog_14375.type_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508434182144L, 130448);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new BDStatusInfo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((BDStatusInfo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locallog_14375.dbStatusInfo_ = ((BDStatusInfo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17508434182144L, 130448);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new SDStatusInfo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((SDStatusInfo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locallog_14375.sdStatusInfo_ = ((SDStatusInfo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17508434182144L, 130448);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new HeavyDetailInfo();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((HeavyDetailInfo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        locallog_14375.heavyDetailInfo_ = ((HeavyDetailInfo)localObject1);
        paramInt += 1;
      }
      GMTrace.o(17508434182144L, 130448);
      return 0;
    }
    GMTrace.o(17508434182144L, 130448);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\log_14375.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */