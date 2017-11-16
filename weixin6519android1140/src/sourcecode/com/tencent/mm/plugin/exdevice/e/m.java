package com.tencent.mm.plugin.exdevice.e;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class m
  extends com.tencent.mm.bm.a
{
  public int kBC;
  public c kBz;
  
  public m()
  {
    GMTrace.i(11110140870656L, 82777);
    GMTrace.o(11110140870656L, 82777);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11110275088384L, 82778);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kBz == null) {
        throw new b("Not all required fields were included: BasePush");
      }
      if (this.kBz != null)
      {
        paramVarArgs.fm(1, this.kBz.aYq());
        this.kBz.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.kBC);
      GMTrace.o(11110275088384L, 82778);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.kBz != null) {
        paramInt = b.a.a.a.fj(1, this.kBz.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.kBC);
      GMTrace.o(11110275088384L, 82778);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.kBz == null) {
        throw new b("Not all required fields were included: BasePush");
      }
      GMTrace.o(11110275088384L, 82778);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      m localm = (m)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(11110275088384L, 82778);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localm.kBz = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(11110275088384L, 82778);
        return 0;
      }
      localm.kBC = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(11110275088384L, 82778);
      return 0;
    }
    GMTrace.o(11110275088384L, 82778);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\e\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */