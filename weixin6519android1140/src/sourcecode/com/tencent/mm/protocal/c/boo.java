package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class boo
  extends ayx
{
  public long uKe;
  public int uKf;
  public com.tencent.mm.bm.b uYA;
  public com.tencent.mm.bm.b uYB;
  public String uYC;
  public String uYz;
  public int udE;
  
  public boo()
  {
    GMTrace.i(3730581749760L, 27795);
    GMTrace.o(3730581749760L, 27795);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3730715967488L, 27796);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uYz == null) {
        throw new b.a.a.b("Not all required fields were included: ToBizUserName");
      }
      if (this.uYB == null) {
        throw new b.a.a.b("Not all required fields were included: CapInfo");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uKf);
      if (this.uYz != null) {
        paramVarArgs.e(3, this.uYz);
      }
      paramVarArgs.fk(4, this.udE);
      if (this.uYA != null) {
        paramVarArgs.b(5, this.uYA);
      }
      if (this.uYB != null) {
        paramVarArgs.b(6, this.uYB);
      }
      paramVarArgs.T(7, this.uKe);
      if (this.uYC != null) {
        paramVarArgs.e(8, this.uYC);
      }
      GMTrace.o(3730715967488L, 27796);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uKf);
      paramInt = i;
      if (this.uYz != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uYz);
      }
      i = paramInt + b.a.a.a.fh(4, this.udE);
      paramInt = i;
      if (this.uYA != null) {
        paramInt = i + b.a.a.a.a(5, this.uYA);
      }
      i = paramInt;
      if (this.uYB != null) {
        i = paramInt + b.a.a.a.a(6, this.uYB);
      }
      i += b.a.a.a.S(7, this.uKe);
      paramInt = i;
      if (this.uYC != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uYC);
      }
      GMTrace.o(3730715967488L, 27796);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uYz == null) {
        throw new b.a.a.b("Not all required fields were included: ToBizUserName");
      }
      if (this.uYB == null) {
        throw new b.a.a.b("Not all required fields were included: CapInfo");
      }
      GMTrace.o(3730715967488L, 27796);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      boo localboo = (boo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3730715967488L, 27796);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localboo.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730715967488L, 27796);
        return 0;
      case 2: 
        localboo.uKf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3730715967488L, 27796);
        return 0;
      case 3: 
        localboo.uYz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3730715967488L, 27796);
        return 0;
      case 4: 
        localboo.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3730715967488L, 27796);
        return 0;
      case 5: 
        localboo.uYA = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3730715967488L, 27796);
        return 0;
      case 6: 
        localboo.uYB = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3730715967488L, 27796);
        return 0;
      case 7: 
        localboo.uKe = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3730715967488L, 27796);
        return 0;
      }
      localboo.uYC = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3730715967488L, 27796);
      return 0;
    }
    GMTrace.o(3730715967488L, 27796);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\boo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */