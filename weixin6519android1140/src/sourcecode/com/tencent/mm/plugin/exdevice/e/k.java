package com.tencent.mm.plugin.exdevice.e;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class k
  extends i
{
  public com.tencent.mm.bm.b jgP;
  public int jib;
  
  public k()
  {
    GMTrace.i(11109603999744L, 82773);
    GMTrace.o(11109603999744L, 82773);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11109738217472L, 82774);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jgP == null) {
        throw new b.a.a.b("Not all required fields were included: Data");
      }
      if (this.kBA != null)
      {
        paramVarArgs.fm(1, this.kBA.aYq());
        this.kBA.a(paramVarArgs);
      }
      if (this.jgP != null) {
        paramVarArgs.b(2, this.jgP);
      }
      paramVarArgs.fk(3, this.jib);
      GMTrace.o(11109738217472L, 82774);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.kBA != null) {
        paramInt = b.a.a.a.fj(1, this.kBA.aYq()) + 0;
      }
      i = paramInt;
      if (this.jgP != null) {
        i = paramInt + b.a.a.a.a(2, this.jgP);
      }
      paramInt = b.a.a.a.fh(3, this.jib);
      GMTrace.o(11109738217472L, 82774);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = i.a(paramVarArgs); paramInt > 0; paramInt = i.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.jgP == null) {
        throw new b.a.a.b("Not all required fields were included: Data");
      }
      GMTrace.o(11109738217472L, 82774);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      k localk = (k)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(11109738217472L, 82774);
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
          localk.kBA = ((d)localObject1);
          paramInt += 1;
        }
        GMTrace.o(11109738217472L, 82774);
        return 0;
      case 2: 
        localk.jgP = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(11109738217472L, 82774);
        return 0;
      }
      localk.jib = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(11109738217472L, 82774);
      return 0;
    }
    GMTrace.o(11109738217472L, 82774);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\e\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */