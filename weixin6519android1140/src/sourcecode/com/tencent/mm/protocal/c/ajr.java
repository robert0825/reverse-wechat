package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajr
  extends azh
{
  public String gCA;
  public String lRT;
  public String tNa;
  public String tNn;
  public String tOY;
  public LinkedList<baa> uod;
  public int uyA;
  public aiy uyv;
  public String uyx;
  public String uyy;
  public String uyz;
  
  public ajr()
  {
    GMTrace.i(3940095623168L, 29356);
    this.uod = new LinkedList();
    GMTrace.o(3940095623168L, 29356);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3940229840896L, 29357);
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
      if (this.uyv != null)
      {
        paramVarArgs.fm(2, this.uyv.aYq());
        this.uyv.a(paramVarArgs);
      }
      if (this.uyy != null) {
        paramVarArgs.e(3, this.uyy);
      }
      paramVarArgs.d(4, 8, this.uod);
      if (this.lRT != null) {
        paramVarArgs.e(5, this.lRT);
      }
      if (this.tOY != null) {
        paramVarArgs.e(6, this.tOY);
      }
      if (this.tNn != null) {
        paramVarArgs.e(7, this.tNn);
      }
      if (this.tNa != null) {
        paramVarArgs.e(8, this.tNa);
      }
      if (this.uyz != null) {
        paramVarArgs.e(9, this.uyz);
      }
      paramVarArgs.fk(10, this.uyA);
      if (this.uyx != null) {
        paramVarArgs.e(11, this.uyx);
      }
      if (this.gCA != null) {
        paramVarArgs.e(12, this.gCA);
      }
      GMTrace.o(3940229840896L, 29357);
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
      if (this.uyv != null) {
        paramInt = i + b.a.a.a.fj(2, this.uyv.aYq());
      }
      i = paramInt;
      if (this.uyy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uyy);
      }
      i += b.a.a.a.c(4, 8, this.uod);
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.lRT);
      }
      i = paramInt;
      if (this.tOY != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tOY);
      }
      paramInt = i;
      if (this.tNn != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tNn);
      }
      i = paramInt;
      if (this.tNa != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tNa);
      }
      paramInt = i;
      if (this.uyz != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uyz);
      }
      i = paramInt + b.a.a.a.fh(10, this.uyA);
      paramInt = i;
      if (this.uyx != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uyx);
      }
      i = paramInt;
      if (this.gCA != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.gCA);
      }
      GMTrace.o(3940229840896L, 29357);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uod.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3940229840896L, 29357);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajr localajr = (ajr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3940229840896L, 29357);
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
          localajr.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aiy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aiy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajr.uyv = ((aiy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 3: 
        localajr.uyy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new baa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((baa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajr.uod.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 5: 
        localajr.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 6: 
        localajr.tOY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 7: 
        localajr.tNn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 8: 
        localajr.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 9: 
        localajr.uyz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 10: 
        localajr.uyA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3940229840896L, 29357);
        return 0;
      case 11: 
        localajr.uyx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940229840896L, 29357);
        return 0;
      }
      localajr.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3940229840896L, 29357);
      return 0;
    }
    GMTrace.o(3940229840896L, 29357);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ajr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */