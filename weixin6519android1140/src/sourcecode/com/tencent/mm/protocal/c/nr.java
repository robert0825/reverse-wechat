package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nr
  extends ayx
{
  public String tPP;
  public int tRC;
  public int tRD;
  public int tRE;
  public azp ues;
  public String uet;
  public String ueu;
  public int uev;
  
  public nr()
  {
    GMTrace.i(3730850185216L, 27797);
    GMTrace.o(3730850185216L, 27797);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3730984402944L, 27798);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tPP != null) {
        paramVarArgs.e(2, this.tPP);
      }
      paramVarArgs.fk(3, this.tRC);
      paramVarArgs.fk(4, this.tRD);
      paramVarArgs.fk(5, this.tRE);
      if (this.ues != null)
      {
        paramVarArgs.fm(6, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      if (this.uet != null) {
        paramVarArgs.e(7, this.uet);
      }
      if (this.ueu != null) {
        paramVarArgs.e(9, this.ueu);
      }
      paramVarArgs.fk(10, this.uev);
      GMTrace.o(3730984402944L, 27798);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.tPP != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tPP);
      }
      i = i + b.a.a.a.fh(3, this.tRC) + b.a.a.a.fh(4, this.tRD) + b.a.a.a.fh(5, this.tRE);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(6, this.ues.aYq());
      }
      i = paramInt;
      if (this.uet != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uet);
      }
      paramInt = i;
      if (this.ueu != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.ueu);
      }
      i = b.a.a.a.fh(10, this.uev);
      GMTrace.o(3730984402944L, 27798);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3730984402944L, 27798);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nr localnr = (nr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 8: 
      default: 
        GMTrace.o(3730984402944L, 27798);
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
          localnr.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 2: 
        localnr.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 3: 
        localnr.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 4: 
        localnr.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 5: 
        localnr.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localnr.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 7: 
        localnr.uet = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 9: 
        localnr.ueu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      }
      localnr.uev = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3730984402944L, 27798);
      return 0;
    }
    GMTrace.o(3730984402944L, 27798);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\nr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */