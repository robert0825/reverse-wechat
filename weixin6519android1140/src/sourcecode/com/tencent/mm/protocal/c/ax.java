package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ax
  extends ayx
{
  public String bssid;
  public int cfz;
  public String gVs;
  public int gVv;
  public int scene;
  public String ssid;
  public String tPe;
  public long tPf;
  public bi tPg;
  public int tPh;
  public int tPi;
  public String tPj;
  
  public ax()
  {
    GMTrace.i(3803461976064L, 28338);
    GMTrace.o(3803461976064L, 28338);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3803596193792L, 28339);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.gVs != null) {
        paramVarArgs.e(2, this.gVs);
      }
      paramVarArgs.fk(3, this.gVv);
      if (this.tPe != null) {
        paramVarArgs.e(4, this.tPe);
      }
      paramVarArgs.fk(5, this.scene);
      if (this.ssid != null) {
        paramVarArgs.e(6, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.e(7, this.bssid);
      }
      paramVarArgs.T(8, this.tPf);
      if (this.tPg != null)
      {
        paramVarArgs.fm(9, this.tPg.aYq());
        this.tPg.a(paramVarArgs);
      }
      paramVarArgs.fk(10, this.tPh);
      paramVarArgs.fk(11, this.tPi);
      paramVarArgs.fk(12, this.cfz);
      if (this.tPj != null) {
        paramVarArgs.e(13, this.tPj);
      }
      GMTrace.o(3803596193792L, 28339);
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
      if (this.gVs != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.gVs);
      }
      i += b.a.a.a.fh(3, this.gVv);
      paramInt = i;
      if (this.tPe != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tPe);
      }
      i = paramInt + b.a.a.a.fh(5, this.scene);
      paramInt = i;
      if (this.ssid != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ssid);
      }
      i = paramInt;
      if (this.bssid != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.bssid);
      }
      i += b.a.a.a.S(8, this.tPf);
      paramInt = i;
      if (this.tPg != null) {
        paramInt = i + b.a.a.a.fj(9, this.tPg.aYq());
      }
      i = paramInt + b.a.a.a.fh(10, this.tPh) + b.a.a.a.fh(11, this.tPi) + b.a.a.a.fh(12, this.cfz);
      paramInt = i;
      if (this.tPj != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.tPj);
      }
      GMTrace.o(3803596193792L, 28339);
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
      GMTrace.o(3803596193792L, 28339);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ax localax = (ax)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3803596193792L, 28339);
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
          localax.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 2: 
        localax.gVs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 3: 
        localax.gVv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 4: 
        localax.tPe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 5: 
        localax.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 6: 
        localax.ssid = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 7: 
        localax.bssid = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 8: 
        localax.tPf = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bi();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localax.tPg = ((bi)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 10: 
        localax.tPh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 11: 
        localax.tPi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      case 12: 
        localax.cfz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3803596193792L, 28339);
        return 0;
      }
      localax.tPj = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3803596193792L, 28339);
      return 0;
    }
    GMTrace.o(3803596193792L, 28339);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */