package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class z
  extends ayx
{
  public String SSID;
  public String URL;
  public String tMU;
  public String tMV;
  public String tMW;
  public int tMX;
  public LinkedList<ck> tMY;
  public int tMZ;
  public String tNa;
  public int tNb;
  public String tNc;
  
  public z()
  {
    GMTrace.i(3980629377024L, 29658);
    this.tMY = new LinkedList();
    GMTrace.o(3980629377024L, 29658);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3980763594752L, 29659);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.URL != null) {
        paramVarArgs.e(2, this.URL);
      }
      if (this.SSID != null) {
        paramVarArgs.e(3, this.SSID);
      }
      if (this.tMU != null) {
        paramVarArgs.e(4, this.tMU);
      }
      if (this.tMV != null) {
        paramVarArgs.e(5, this.tMV);
      }
      if (this.tMW != null) {
        paramVarArgs.e(6, this.tMW);
      }
      paramVarArgs.fk(7, this.tMX);
      paramVarArgs.d(8, 8, this.tMY);
      paramVarArgs.fk(9, this.tMZ);
      if (this.tNa != null) {
        paramVarArgs.e(10, this.tNa);
      }
      paramVarArgs.fk(11, this.tNb);
      if (this.tNc != null) {
        paramVarArgs.e(12, this.tNc);
      }
      GMTrace.o(3980763594752L, 29659);
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
      if (this.URL != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.URL);
      }
      i = paramInt;
      if (this.SSID != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.SSID);
      }
      paramInt = i;
      if (this.tMU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tMU);
      }
      i = paramInt;
      if (this.tMV != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tMV);
      }
      paramInt = i;
      if (this.tMW != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tMW);
      }
      i = paramInt + b.a.a.a.fh(7, this.tMX) + b.a.a.a.c(8, 8, this.tMY) + b.a.a.a.fh(9, this.tMZ);
      paramInt = i;
      if (this.tNa != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tNa);
      }
      i = paramInt + b.a.a.a.fh(11, this.tNb);
      paramInt = i;
      if (this.tNc != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tNc);
      }
      GMTrace.o(3980763594752L, 29659);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tMY.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3980763594752L, 29659);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      z localz = (z)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3980763594752L, 29659);
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
          localz.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 2: 
        localz.URL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 3: 
        localz.SSID = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 4: 
        localz.tMU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 5: 
        localz.tMV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 6: 
        localz.tMW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 7: 
        localz.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ck();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ck)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localz.tMY.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 9: 
        localz.tMZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 10: 
        localz.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 11: 
        localz.tNb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      }
      localz.tNc = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3980763594752L, 29659);
      return 0;
    }
    GMTrace.o(3980763594752L, 29659);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */