package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abk
  extends azh
{
  public String gCz;
  public int tXv;
  public String tXx;
  public azp urP;
  public int urU;
  public LinkedList<azq> urV;
  public int urW;
  public LinkedList<alj> urX;
  public String urY;
  public int urZ;
  public int usa;
  public alk usb;
  public String usc;
  
  public abk()
  {
    GMTrace.i(3688974254080L, 27485);
    this.urV = new LinkedList();
    this.urX = new LinkedList();
    GMTrace.o(3688974254080L, 27485);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3689108471808L, 27486);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urP == null) {
        throw new b("Not all required fields were included: Buff");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.urP != null)
      {
        paramVarArgs.fm(2, this.urP.aYq());
        this.urP.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.urU);
      paramVarArgs.d(4, 8, this.urV);
      paramVarArgs.fk(5, this.urW);
      paramVarArgs.d(6, 8, this.urX);
      paramVarArgs.fk(7, this.tXv);
      if (this.urY != null) {
        paramVarArgs.e(8, this.urY);
      }
      if (this.tXx != null) {
        paramVarArgs.e(9, this.tXx);
      }
      paramVarArgs.fk(10, this.urZ);
      if (this.gCz != null) {
        paramVarArgs.e(11, this.gCz);
      }
      paramVarArgs.fk(12, this.usa);
      if (this.usb != null)
      {
        paramVarArgs.fm(13, this.usb.aYq());
        this.usb.a(paramVarArgs);
      }
      if (this.usc != null) {
        paramVarArgs.e(14, this.usc);
      }
      GMTrace.o(3689108471808L, 27486);
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
      if (this.urP != null) {
        i = paramInt + b.a.a.a.fj(2, this.urP.aYq());
      }
      i = i + b.a.a.a.fh(3, this.urU) + b.a.a.a.c(4, 8, this.urV) + b.a.a.a.fh(5, this.urW) + b.a.a.a.c(6, 8, this.urX) + b.a.a.a.fh(7, this.tXv);
      paramInt = i;
      if (this.urY != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.urY);
      }
      i = paramInt;
      if (this.tXx != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tXx);
      }
      i += b.a.a.a.fh(10, this.urZ);
      paramInt = i;
      if (this.gCz != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.gCz);
      }
      i = paramInt + b.a.a.a.fh(12, this.usa);
      paramInt = i;
      if (this.usb != null) {
        paramInt = i + b.a.a.a.fj(13, this.usb.aYq());
      }
      i = paramInt;
      if (this.usc != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.usc);
      }
      GMTrace.o(3689108471808L, 27486);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.urV.clear();
      this.urX.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urP == null) {
        throw new b("Not all required fields were included: Buff");
      }
      GMTrace.o(3689108471808L, 27486);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abk localabk = (abk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3689108471808L, 27486);
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
          localabk.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3689108471808L, 27486);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabk.urP = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 3: 
        localabk.urU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabk.urV.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 5: 
        localabk.urW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabk.urX.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 7: 
        localabk.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 8: 
        localabk.urY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 9: 
        localabk.tXx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 10: 
        localabk.urZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 11: 
        localabk.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 12: 
        localabk.usa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3689108471808L, 27486);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabk.usb = ((alk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3689108471808L, 27486);
        return 0;
      }
      localabk.usc = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3689108471808L, 27486);
      return 0;
    }
    GMTrace.o(3689108471808L, 27486);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */