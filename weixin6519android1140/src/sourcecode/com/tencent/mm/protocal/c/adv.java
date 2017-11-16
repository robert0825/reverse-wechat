package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adv
  extends ayx
{
  public String jio;
  public String kBh;
  public String tSy;
  public azp tUK;
  public String utC;
  public String utD;
  public String utE;
  public String utF;
  public String utG;
  public int utH;
  
  public adv()
  {
    GMTrace.i(3797019525120L, 28290);
    GMTrace.o(3797019525120L, 28290);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3797153742848L, 28291);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(2, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      if (this.utC != null) {
        paramVarArgs.e(3, this.utC);
      }
      if (this.utD != null) {
        paramVarArgs.e(4, this.utD);
      }
      if (this.jio != null) {
        paramVarArgs.e(5, this.jio);
      }
      if (this.utE != null) {
        paramVarArgs.e(6, this.utE);
      }
      if (this.utF != null) {
        paramVarArgs.e(7, this.utF);
      }
      if (this.utG != null) {
        paramVarArgs.e(8, this.utG);
      }
      paramVarArgs.fk(9, this.utH);
      if (this.kBh != null) {
        paramVarArgs.e(10, this.kBh);
      }
      if (this.tSy != null) {
        paramVarArgs.e(11, this.tSy);
      }
      GMTrace.o(3797153742848L, 28291);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.tUK != null) {
        paramInt = i + b.a.a.a.fj(2, this.tUK.aYq());
      }
      i = paramInt;
      if (this.utC != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.utC);
      }
      paramInt = i;
      if (this.utD != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.utD);
      }
      i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jio);
      }
      paramInt = i;
      if (this.utE != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.utE);
      }
      i = paramInt;
      if (this.utF != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.utF);
      }
      paramInt = i;
      if (this.utG != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.utG);
      }
      i = paramInt + b.a.a.a.fh(9, this.utH);
      paramInt = i;
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.kBh);
      }
      i = paramInt;
      if (this.tSy != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.tSy);
      }
      GMTrace.o(3797153742848L, 28291);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      GMTrace.o(3797153742848L, 28291);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adv localadv = (adv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3797153742848L, 28291);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localadv.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3797153742848L, 28291);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localadv.tUK = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3797153742848L, 28291);
        return 0;
      case 3: 
        localadv.utC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3797153742848L, 28291);
        return 0;
      case 4: 
        localadv.utD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3797153742848L, 28291);
        return 0;
      case 5: 
        localadv.jio = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3797153742848L, 28291);
        return 0;
      case 6: 
        localadv.utE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3797153742848L, 28291);
        return 0;
      case 7: 
        localadv.utF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3797153742848L, 28291);
        return 0;
      case 8: 
        localadv.utG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3797153742848L, 28291);
        return 0;
      case 9: 
        localadv.utH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3797153742848L, 28291);
        return 0;
      case 10: 
        localadv.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3797153742848L, 28291);
        return 0;
      }
      localadv.tSy = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3797153742848L, 28291);
      return 0;
    }
    GMTrace.o(3797153742848L, 28291);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\adv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */