package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mj
  extends azh
{
  public int kBk;
  public String kBl;
  public String token;
  public asw udl;
  
  public mj()
  {
    GMTrace.i(3906004320256L, 29102);
    GMTrace.o(3906004320256L, 29102);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3906138537984L, 29103);
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
      paramVarArgs.fk(2, this.kBk);
      if (this.kBl != null) {
        paramVarArgs.e(3, this.kBl);
      }
      if (this.token != null) {
        paramVarArgs.e(4, this.token);
      }
      if (this.udl != null)
      {
        paramVarArgs.fm(5, this.udl.aYq());
        this.udl.a(paramVarArgs);
      }
      GMTrace.o(3906138537984L, 29103);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.kBk);
      paramInt = i;
      if (this.kBl != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kBl);
      }
      i = paramInt;
      if (this.token != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.token);
      }
      paramInt = i;
      if (this.udl != null) {
        paramInt = i + b.a.a.a.fj(5, this.udl.aYq());
      }
      GMTrace.o(3906138537984L, 29103);
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
      GMTrace.o(3906138537984L, 29103);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mj localmj = (mj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3906138537984L, 29103);
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
          localmj.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3906138537984L, 29103);
        return 0;
      case 2: 
        localmj.kBk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3906138537984L, 29103);
        return 0;
      case 3: 
        localmj.kBl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3906138537984L, 29103);
        return 0;
      case 4: 
        localmj.token = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3906138537984L, 29103);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new asw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((asw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localmj.udl = ((asw)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3906138537984L, 29103);
      return 0;
    }
    GMTrace.o(3906138537984L, 29103);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\mj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */