package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aip
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int kAW;
  public String tUp;
  public String ueH;
  public azq uxT;
  public int uxU;
  
  public aip()
  {
    GMTrace.i(3911641464832L, 29144);
    GMTrace.o(3911641464832L, 29144);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3911775682560L, 29145);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uxT == null) {
        throw new b("Not all required fields were included: NickName");
      }
      paramVarArgs.fk(1, this.kAW);
      if (this.uxT != null)
      {
        paramVarArgs.fm(2, this.uxT.aYq());
        this.uxT.a(paramVarArgs);
      }
      if (this.tUp != null) {
        paramVarArgs.e(3, this.tUp);
      }
      if (this.ueH != null) {
        paramVarArgs.e(4, this.ueH);
      }
      if (this.jhi != null) {
        paramVarArgs.e(5, this.jhi);
      }
      paramVarArgs.fk(6, this.uxU);
      GMTrace.o(3911775682560L, 29145);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.kAW) + 0;
      paramInt = i;
      if (this.uxT != null) {
        paramInt = i + b.a.a.a.fj(2, this.uxT.aYq());
      }
      i = paramInt;
      if (this.tUp != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUp);
      }
      paramInt = i;
      if (this.ueH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ueH);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhi);
      }
      paramInt = b.a.a.a.fh(6, this.uxU);
      GMTrace.o(3911775682560L, 29145);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uxT == null) {
        throw new b("Not all required fields were included: NickName");
      }
      GMTrace.o(3911775682560L, 29145);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aip localaip = (aip)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3911775682560L, 29145);
        return -1;
      case 1: 
        localaip.kAW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3911775682560L, 29145);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaip.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3911775682560L, 29145);
        return 0;
      case 3: 
        localaip.tUp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3911775682560L, 29145);
        return 0;
      case 4: 
        localaip.ueH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3911775682560L, 29145);
        return 0;
      case 5: 
        localaip.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3911775682560L, 29145);
        return 0;
      }
      localaip.uxU = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3911775682560L, 29145);
      return 0;
    }
    GMTrace.o(3911775682560L, 29145);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */