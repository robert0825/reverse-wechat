package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class biw
  extends azh
{
  public int uJd;
  public String uJe;
  public azp uwX;
  public int uwY;
  public String uwZ;
  public int uxa;
  
  public biw()
  {
    GMTrace.i(3893119418368L, 29006);
    GMTrace.o(3893119418368L, 29006);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3893253636096L, 29007);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uwX == null) {
        throw new b("Not all required fields were included: RetText");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uwX != null)
      {
        paramVarArgs.fm(2, this.uwX.aYq());
        this.uwX.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uwY);
      if (this.uwZ != null) {
        paramVarArgs.e(4, this.uwZ);
      }
      paramVarArgs.fk(5, this.uxa);
      paramVarArgs.fk(6, this.uJd);
      if (this.uJe != null) {
        paramVarArgs.e(7, this.uJe);
      }
      GMTrace.o(3893253636096L, 29007);
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
      if (this.uwX != null) {
        i = paramInt + b.a.a.a.fj(2, this.uwX.aYq());
      }
      i += b.a.a.a.fh(3, this.uwY);
      paramInt = i;
      if (this.uwZ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uwZ);
      }
      i = paramInt + b.a.a.a.fh(5, this.uxa) + b.a.a.a.fh(6, this.uJd);
      paramInt = i;
      if (this.uJe != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uJe);
      }
      GMTrace.o(3893253636096L, 29007);
      return paramInt;
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
      if (this.uwX == null) {
        throw new b("Not all required fields were included: RetText");
      }
      GMTrace.o(3893253636096L, 29007);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      biw localbiw = (biw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3893253636096L, 29007);
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
          localbiw.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3893253636096L, 29007);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbiw.uwX = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3893253636096L, 29007);
        return 0;
      case 3: 
        localbiw.uwY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3893253636096L, 29007);
        return 0;
      case 4: 
        localbiw.uwZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3893253636096L, 29007);
        return 0;
      case 5: 
        localbiw.uxa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3893253636096L, 29007);
        return 0;
      case 6: 
        localbiw.uJd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3893253636096L, 29007);
        return 0;
      }
      localbiw.uJe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3893253636096L, 29007);
      return 0;
    }
    GMTrace.o(3893253636096L, 29007);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\biw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */