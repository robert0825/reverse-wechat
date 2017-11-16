package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class BDStatusInfo
  extends com.tencent.mm.bm.a
{
  public long favDBSize_;
  public long mmDBSize_;
  public int mmDBTableCount_;
  public long snsDBSize_;
  public LinkedList<TableInfo> tableList_;
  
  public BDStatusInfo()
  {
    GMTrace.i(17508031528960L, 130445);
    this.tableList_ = new LinkedList();
    GMTrace.o(17508031528960L, 130445);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17508165746688L, 130446);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.mmDBSize_);
      paramVarArgs.T(2, this.snsDBSize_);
      paramVarArgs.fk(3, this.mmDBTableCount_);
      paramVarArgs.d(4, 8, this.tableList_);
      paramVarArgs.T(5, this.favDBSize_);
      GMTrace.o(17508165746688L, 130446);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.mmDBSize_);
      i = b.a.a.a.S(2, this.snsDBSize_);
      int j = b.a.a.a.fh(3, this.mmDBTableCount_);
      int k = b.a.a.a.c(4, 8, this.tableList_);
      int m = b.a.a.a.S(5, this.favDBSize_);
      GMTrace.o(17508165746688L, 130446);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tableList_.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17508165746688L, 130446);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      BDStatusInfo localBDStatusInfo = (BDStatusInfo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17508165746688L, 130446);
        return -1;
      case 1: 
        localBDStatusInfo.mmDBSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508165746688L, 130446);
        return 0;
      case 2: 
        localBDStatusInfo.snsDBSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17508165746688L, 130446);
        return 0;
      case 3: 
        localBDStatusInfo.mmDBTableCount_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17508165746688L, 130446);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new TableInfo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((TableInfo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localBDStatusInfo.tableList_.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17508165746688L, 130446);
        return 0;
      }
      localBDStatusInfo.favDBSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(17508165746688L, 130446);
      return 0;
    }
    GMTrace.o(17508165746688L, 130446);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\BDStatusInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */