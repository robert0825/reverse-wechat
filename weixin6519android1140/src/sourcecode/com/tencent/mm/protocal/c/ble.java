package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ble
  extends ayx
{
  public String jhi;
  public int jib;
  public String lQa;
  public int tQM;
  public int tRC;
  public int tRD;
  public int tRE;
  public String uVp;
  public azp ues;
  public String ugH;
  
  public ble()
  {
    GMTrace.i(3889898192896L, 28982);
    GMTrace.o(3889898192896L, 28982);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3890032410624L, 28983);
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
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      paramVarArgs.fk(3, this.tQM);
      if (this.uVp != null) {
        paramVarArgs.e(4, this.uVp);
      }
      if (this.jhi != null) {
        paramVarArgs.e(5, this.jhi);
      }
      paramVarArgs.fk(6, this.tRC);
      paramVarArgs.fk(7, this.tRD);
      paramVarArgs.fk(8, this.tRE);
      if (this.ues != null)
      {
        paramVarArgs.fm(9, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.fk(10, this.jib);
      if (this.ugH != null) {
        paramVarArgs.e(11, this.ugH);
      }
      GMTrace.o(3890032410624L, 28983);
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
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQa);
      }
      i += b.a.a.a.fh(3, this.tQM);
      paramInt = i;
      if (this.uVp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uVp);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhi);
      }
      i = i + b.a.a.a.fh(6, this.tRC) + b.a.a.a.fh(7, this.tRD) + b.a.a.a.fh(8, this.tRE);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(9, this.ues.aYq());
      }
      i = paramInt + b.a.a.a.fh(10, this.jib);
      paramInt = i;
      if (this.ugH != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.ugH);
      }
      GMTrace.o(3890032410624L, 28983);
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
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3890032410624L, 28983);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ble localble = (ble)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3890032410624L, 28983);
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
          localble.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 2: 
        localble.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 3: 
        localble.tQM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 4: 
        localble.uVp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 5: 
        localble.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 6: 
        localble.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 7: 
        localble.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 8: 
        localble.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localble.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3890032410624L, 28983);
        return 0;
      case 10: 
        localble.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3890032410624L, 28983);
        return 0;
      }
      localble.ugH = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3890032410624L, 28983);
      return 0;
    }
    GMTrace.o(3890032410624L, 28983);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ble.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */