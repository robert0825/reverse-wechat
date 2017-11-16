package com.tencent.mm.plugin.exdevice.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class f
  extends i
{
  public b kBm;
  public b kBn;
  
  public f()
  {
    GMTrace.i(11110811959296L, 82782);
    GMTrace.o(11110811959296L, 82782);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11110946177024L, 82783);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kBA != null)
      {
        paramVarArgs.fm(1, this.kBA.aYq());
        this.kBA.a(paramVarArgs);
      }
      if (this.kBm != null) {
        paramVarArgs.b(2, this.kBm);
      }
      if (this.kBn != null) {
        paramVarArgs.b(3, this.kBn);
      }
      GMTrace.o(11110946177024L, 82783);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.kBA != null) {
        i = b.a.a.a.fj(1, this.kBA.aYq()) + 0;
      }
      paramInt = i;
      if (this.kBm != null) {
        paramInt = i + b.a.a.a.a(2, this.kBm);
      }
      i = paramInt;
      if (this.kBn != null) {
        i = paramInt + b.a.a.a.a(3, this.kBn);
      }
      GMTrace.o(11110946177024L, 82783);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = i.a(paramVarArgs); paramInt > 0; paramInt = i.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(11110946177024L, 82783);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(11110946177024L, 82783);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, i.a((b.a.a.a.a)localObject2))) {}
          localf.kBA = ((d)localObject1);
          paramInt += 1;
        }
        GMTrace.o(11110946177024L, 82783);
        return 0;
      case 2: 
        localf.kBm = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(11110946177024L, 82783);
        return 0;
      }
      localf.kBn = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(11110946177024L, 82783);
      return 0;
    }
    GMTrace.o(11110946177024L, 82783);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */