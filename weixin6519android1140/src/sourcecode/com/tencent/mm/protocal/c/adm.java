package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adm
  extends azh
{
  public String jzG;
  public int jzH;
  public String jzI;
  
  public adm()
  {
    GMTrace.i(3631663284224L, 27058);
    GMTrace.o(3631663284224L, 27058);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3631797501952L, 27059);
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
      if (this.jzG != null) {
        paramVarArgs.e(2, this.jzG);
      }
      paramVarArgs.fk(3, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(4, this.jzI);
      }
      GMTrace.o(3631797501952L, 27059);
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
      if (this.jzG != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jzG);
      }
      i += b.a.a.a.fh(3, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jzI);
      }
      GMTrace.o(3631797501952L, 27059);
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
      GMTrace.o(3631797501952L, 27059);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adm localadm = (adm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3631797501952L, 27059);
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
          localadm.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3631797501952L, 27059);
        return 0;
      case 2: 
        localadm.jzG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3631797501952L, 27059);
        return 0;
      case 3: 
        localadm.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3631797501952L, 27059);
        return 0;
      }
      localadm.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3631797501952L, 27059);
      return 0;
    }
    GMTrace.o(3631797501952L, 27059);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\adm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */