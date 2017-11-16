package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asd
  extends com.tencent.mm.bm.a
{
  public int uId;
  public azp uIe;
  public int uIf;
  
  public asd()
  {
    GMTrace.i(13167430205440L, 98105);
    GMTrace.o(13167430205440L, 98105);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13167564423168L, 98106);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uId);
      if (this.uIe != null)
      {
        paramVarArgs.fm(2, this.uIe.aYq());
        this.uIe.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uIf);
      GMTrace.o(13167564423168L, 98106);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uId) + 0;
      paramInt = i;
      if (this.uIe != null) {
        paramInt = i + b.a.a.a.fj(2, this.uIe.aYq());
      }
      i = b.a.a.a.fh(3, this.uIf);
      GMTrace.o(13167564423168L, 98106);
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
      GMTrace.o(13167564423168L, 98106);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asd localasd = (asd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13167564423168L, 98106);
        return -1;
      case 1: 
        localasd.uId = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13167564423168L, 98106);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localasd.uIe = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13167564423168L, 98106);
        return 0;
      }
      localasd.uIf = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13167564423168L, 98106);
      return 0;
    }
    GMTrace.o(13167564423168L, 98106);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\asd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */