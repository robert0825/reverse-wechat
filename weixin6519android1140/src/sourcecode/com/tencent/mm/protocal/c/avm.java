package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avm
  extends azh
{
  public int jzH;
  public String jzI;
  public String tMu;
  public String uKL;
  public String uKM;
  
  public avm()
  {
    GMTrace.i(17869748305920L, 133140);
    GMTrace.o(17869748305920L, 133140);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17869882523648L, 133141);
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
      paramVarArgs.fk(2, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(3, this.jzI);
      }
      if (this.uKL != null) {
        paramVarArgs.e(4, this.uKL);
      }
      if (this.tMu != null) {
        paramVarArgs.e(5, this.tMu);
      }
      if (this.uKM != null) {
        paramVarArgs.e(6, this.uKM);
      }
      GMTrace.o(17869882523648L, 133141);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jzI);
      }
      i = paramInt;
      if (this.uKL != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uKL);
      }
      paramInt = i;
      if (this.tMu != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tMu);
      }
      i = paramInt;
      if (this.uKM != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uKM);
      }
      GMTrace.o(17869882523648L, 133141);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(17869882523648L, 133141);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avm localavm = (avm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17869882523648L, 133141);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavm.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17869882523648L, 133141);
        return 0;
      case 2: 
        localavm.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17869882523648L, 133141);
        return 0;
      case 3: 
        localavm.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17869882523648L, 133141);
        return 0;
      case 4: 
        localavm.uKL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17869882523648L, 133141);
        return 0;
      case 5: 
        localavm.tMu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17869882523648L, 133141);
        return 0;
      }
      localavm.uKM = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17869882523648L, 133141);
      return 0;
    }
    GMTrace.o(17869882523648L, 133141);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */