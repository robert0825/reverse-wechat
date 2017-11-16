package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arj
  extends azh
{
  public ny uHC;
  public ny uHD;
  public int ugn;
  
  public arj()
  {
    GMTrace.i(3624415526912L, 27004);
    GMTrace.o(3624415526912L, 27004);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3624549744640L, 27005);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uHC == null) {
        throw new b("Not all required fields were included: SmallContentBuff");
      }
      if (this.uHD == null) {
        throw new b("Not all required fields were included: BigContentBuff");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uHC != null)
      {
        paramVarArgs.fm(2, this.uHC.aYq());
        this.uHC.a(paramVarArgs);
      }
      if (this.uHD != null)
      {
        paramVarArgs.fm(3, this.uHD.aYq());
        this.uHD.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.ugn);
      GMTrace.o(3624549744640L, 27005);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uHC != null) {
        paramInt = i + b.a.a.a.fj(2, this.uHC.aYq());
      }
      i = paramInt;
      if (this.uHD != null) {
        i = paramInt + b.a.a.a.fj(3, this.uHD.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.ugn);
      GMTrace.o(3624549744640L, 27005);
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
      if (this.uHC == null) {
        throw new b("Not all required fields were included: SmallContentBuff");
      }
      if (this.uHD == null) {
        throw new b("Not all required fields were included: BigContentBuff");
      }
      GMTrace.o(3624549744640L, 27005);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arj localarj = (arj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3624549744640L, 27005);
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
          localarj.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3624549744640L, 27005);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ny();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ny)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localarj.uHC = ((ny)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3624549744640L, 27005);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ny();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ny)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localarj.uHD = ((ny)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3624549744640L, 27005);
        return 0;
      }
      localarj.ugn = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3624549744640L, 27005);
      return 0;
    }
    GMTrace.o(3624549744640L, 27005);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\arj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */