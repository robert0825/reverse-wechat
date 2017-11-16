package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class yr
  extends azh
{
  public int uoK;
  public awt upz;
  
  public yr()
  {
    GMTrace.i(13575183663104L, 101143);
    GMTrace.o(13575183663104L, 101143);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13575317880832L, 101144);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.upz == null) {
        throw new b("Not all required fields were included: CertValue");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.upz != null)
      {
        paramVarArgs.fm(2, this.upz.aYq());
        this.upz.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uoK);
      GMTrace.o(13575317880832L, 101144);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.upz != null) {
        i = paramInt + b.a.a.a.fj(2, this.upz.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.uoK);
      GMTrace.o(13575317880832L, 101144);
      return i + paramInt;
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
      if (this.upz == null) {
        throw new b("Not all required fields were included: CertValue");
      }
      GMTrace.o(13575317880832L, 101144);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      yr localyr = (yr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13575317880832L, 101144);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localyr.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575317880832L, 101144);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localyr.upz = ((awt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575317880832L, 101144);
        return 0;
      }
      localyr.uoK = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13575317880832L, 101144);
      return 0;
    }
    GMTrace.o(13575317880832L, 101144);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\yr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */