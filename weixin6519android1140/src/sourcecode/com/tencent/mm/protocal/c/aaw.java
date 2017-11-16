package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aaw
  extends com.tencent.mm.bm.a
{
  public int tST;
  public agx tUb;
  public String ugx;
  public int urq;
  
  public aaw()
  {
    GMTrace.i(3742392909824L, 27883);
    GMTrace.o(3742392909824L, 27883);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3742527127552L, 27884);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tST);
      if (this.tUb != null)
      {
        paramVarArgs.fm(2, this.tUb.aYq());
        this.tUb.a(paramVarArgs);
      }
      if (this.ugx != null) {
        paramVarArgs.e(3, this.ugx);
      }
      paramVarArgs.fk(4, this.urq);
      GMTrace.o(3742527127552L, 27884);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0;
      paramInt = i;
      if (this.tUb != null) {
        paramInt = i + b.a.a.a.fj(2, this.tUb.aYq());
      }
      i = paramInt;
      if (this.ugx != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugx);
      }
      paramInt = b.a.a.a.fh(4, this.urq);
      GMTrace.o(3742527127552L, 27884);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3742527127552L, 27884);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aaw localaaw = (aaw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3742527127552L, 27884);
        return -1;
      case 1: 
        localaaw.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3742527127552L, 27884);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaaw.tUb = ((agx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3742527127552L, 27884);
        return 0;
      case 3: 
        localaaw.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3742527127552L, 27884);
        return 0;
      }
      localaaw.urq = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3742527127552L, 27884);
      return 0;
    }
    GMTrace.o(3742527127552L, 27884);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */