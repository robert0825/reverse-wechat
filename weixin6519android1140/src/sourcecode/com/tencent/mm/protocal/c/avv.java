package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avv
  extends azh
{
  public int jzH;
  public String jzI;
  public String ree;
  public atz tUn;
  public String uLb;
  public LinkedList<en> uLc;
  
  public avv()
  {
    GMTrace.i(19147769511936L, 142662);
    this.uLc = new LinkedList();
    GMTrace.o(19147769511936L, 142662);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19147903729664L, 142663);
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
      if (this.uLb != null) {
        paramVarArgs.e(4, this.uLb);
      }
      paramVarArgs.d(5, 8, this.uLc);
      if (this.tUn != null)
      {
        paramVarArgs.fm(6, this.tUn.aYq());
        this.tUn.a(paramVarArgs);
      }
      if (this.ree != null) {
        paramVarArgs.e(7, this.ree);
      }
      GMTrace.o(19147903729664L, 142663);
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
      if (this.uLb != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uLb);
      }
      i += b.a.a.a.c(5, 8, this.uLc);
      paramInt = i;
      if (this.tUn != null) {
        paramInt = i + b.a.a.a.fj(6, this.tUn.aYq());
      }
      i = paramInt;
      if (this.ree != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ree);
      }
      GMTrace.o(19147903729664L, 142663);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uLc.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(19147903729664L, 142663);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avv localavv = (avv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(19147903729664L, 142663);
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
          localavv.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19147903729664L, 142663);
        return 0;
      case 2: 
        localavv.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19147903729664L, 142663);
        return 0;
      case 3: 
        localavv.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147903729664L, 142663);
        return 0;
      case 4: 
        localavv.uLb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147903729664L, 142663);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavv.uLc.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(19147903729664L, 142663);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavv.tUn = ((atz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19147903729664L, 142663);
        return 0;
      }
      localavv.ree = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19147903729664L, 142663);
      return 0;
    }
    GMTrace.o(19147903729664L, 142663);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\avv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */