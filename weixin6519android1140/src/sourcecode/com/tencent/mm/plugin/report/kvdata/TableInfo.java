package com.tencent.mm.plugin.report.kvdata;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public class TableInfo
  extends com.tencent.mm.bm.a
{
  public long count_;
  public String name_;
  
  public TableInfo()
  {
    GMTrace.i(17507494658048L, 130441);
    GMTrace.o(17507494658048L, 130441);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17507628875776L, 130442);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.name_ == null) {
        throw new b("Not all required fields were included: name_");
      }
      if (this.name_ != null) {
        paramVarArgs.e(1, this.name_);
      }
      paramVarArgs.T(2, this.count_);
      GMTrace.o(17507628875776L, 130442);
      return 0;
    }
    if (paramInt == 1) {
      if (this.name_ == null) {
        break label318;
      }
    }
    label318:
    for (paramInt = b.a.a.b.b.a.f(1, this.name_) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.S(2, this.count_);
      GMTrace.o(17507628875776L, 130442);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.name_ == null) {
          throw new b("Not all required fields were included: name_");
        }
        GMTrace.o(17507628875776L, 130442);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        TableInfo localTableInfo = (TableInfo)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(17507628875776L, 130442);
          return -1;
        case 1: 
          localTableInfo.name_ = locala.yqV.readString();
          GMTrace.o(17507628875776L, 130442);
          return 0;
        }
        localTableInfo.count_ = locala.yqV.nk();
        GMTrace.o(17507628875776L, 130442);
        return 0;
      }
      GMTrace.o(17507628875776L, 130442);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\TableInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */