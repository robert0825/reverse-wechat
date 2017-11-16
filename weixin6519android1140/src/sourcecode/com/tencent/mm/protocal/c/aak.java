package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aak
  extends azh
{
  public long jhz;
  public long tPT;
  public int ura;
  public int urb;
  public int urc;
  
  public aak()
  {
    GMTrace.i(3873389412352L, 28859);
    GMTrace.o(3873389412352L, 28859);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3873523630080L, 28860);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.T(2, this.tPT);
      paramVarArgs.T(3, this.jhz);
      paramVarArgs.fk(4, this.ura);
      paramVarArgs.fk(5, this.urb);
      paramVarArgs.fk(6, this.urc);
      GMTrace.o(3873523630080L, 28860);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.S(2, this.tPT);
      int j = b.a.a.a.S(3, this.jhz);
      int k = b.a.a.a.fh(4, this.ura);
      int m = b.a.a.a.fh(5, this.urb);
      int n = b.a.a.a.fh(6, this.urc);
      GMTrace.o(3873523630080L, 28860);
      return paramInt + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3873523630080L, 28860);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aak localaak = (aak)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3873523630080L, 28860);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaak.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3873523630080L, 28860);
        return 0;
      case 2: 
        localaak.tPT = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3873523630080L, 28860);
        return 0;
      case 3: 
        localaak.jhz = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3873523630080L, 28860);
        return 0;
      case 4: 
        localaak.ura = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3873523630080L, 28860);
        return 0;
      case 5: 
        localaak.urb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3873523630080L, 28860);
        return 0;
      }
      localaak.urc = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3873523630080L, 28860);
      return 0;
    }
    GMTrace.o(3873523630080L, 28860);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */