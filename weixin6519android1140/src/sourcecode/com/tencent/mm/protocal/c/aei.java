package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aei
  extends azh
{
  public int utW;
  public String utX;
  public int utY;
  public String utZ;
  public int uua;
  public LinkedList<azq> uub;
  public String uuc;
  public int uud;
  public String uue;
  public int uuf;
  public azp uug;
  
  public aei()
  {
    GMTrace.i(3918620786688L, 29196);
    this.uub = new LinkedList();
    GMTrace.o(3918620786688L, 29196);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3918755004416L, 29197);
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
      paramVarArgs.fk(2, this.utW);
      if (this.utX != null) {
        paramVarArgs.e(3, this.utX);
      }
      paramVarArgs.fk(4, this.utY);
      if (this.utZ != null) {
        paramVarArgs.e(5, this.utZ);
      }
      paramVarArgs.fk(6, this.uua);
      paramVarArgs.d(7, 8, this.uub);
      if (this.uuc != null) {
        paramVarArgs.e(8, this.uuc);
      }
      paramVarArgs.fk(9, this.uud);
      if (this.uue != null) {
        paramVarArgs.e(10, this.uue);
      }
      paramVarArgs.fk(11, this.uuf);
      if (this.uug != null)
      {
        paramVarArgs.fm(12, this.uug.aYq());
        this.uug.a(paramVarArgs);
      }
      GMTrace.o(3918755004416L, 29197);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.utW);
      paramInt = i;
      if (this.utX != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.utX);
      }
      i = paramInt + b.a.a.a.fh(4, this.utY);
      paramInt = i;
      if (this.utZ != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.utZ);
      }
      i = paramInt + b.a.a.a.fh(6, this.uua) + b.a.a.a.c(7, 8, this.uub);
      paramInt = i;
      if (this.uuc != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uuc);
      }
      i = paramInt + b.a.a.a.fh(9, this.uud);
      paramInt = i;
      if (this.uue != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.uue);
      }
      i = paramInt + b.a.a.a.fh(11, this.uuf);
      paramInt = i;
      if (this.uug != null) {
        paramInt = i + b.a.a.a.fj(12, this.uug.aYq());
      }
      GMTrace.o(3918755004416L, 29197);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uub.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3918755004416L, 29197);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aei localaei = (aei)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3918755004416L, 29197);
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
          localaei.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 2: 
        localaei.utW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 3: 
        localaei.utX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 4: 
        localaei.utY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 5: 
        localaei.utZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 6: 
        localaei.uua = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaei.uub.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 8: 
        localaei.uuc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 9: 
        localaei.uud = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 10: 
        localaei.uue = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      case 11: 
        localaei.uuf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3918755004416L, 29197);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localaei.uug = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3918755004416L, 29197);
      return 0;
    }
    GMTrace.o(3918755004416L, 29197);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */