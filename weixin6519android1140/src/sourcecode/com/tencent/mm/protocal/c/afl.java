package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afl
  extends azh
{
  public int uqM;
  public LinkedList<bqf> uqN;
  public String uuV;
  public String uuX;
  public int uuY;
  public String uuZ;
  public String uva;
  public String uvb;
  
  public afl()
  {
    GMTrace.i(3652735467520L, 27215);
    this.uqN = new LinkedList();
    GMTrace.o(3652735467520L, 27215);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3652869685248L, 27216);
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
      paramVarArgs.fk(2, this.uqM);
      paramVarArgs.d(3, 8, this.uqN);
      if (this.uuX != null) {
        paramVarArgs.e(4, this.uuX);
      }
      if (this.uuV != null) {
        paramVarArgs.e(5, this.uuV);
      }
      paramVarArgs.fk(6, this.uuY);
      if (this.uuZ != null) {
        paramVarArgs.e(7, this.uuZ);
      }
      if (this.uva != null) {
        paramVarArgs.e(8, this.uva);
      }
      if (this.uvb != null) {
        paramVarArgs.e(9, this.uvb);
      }
      GMTrace.o(3652869685248L, 27216);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uqM) + b.a.a.a.c(3, 8, this.uqN);
      paramInt = i;
      if (this.uuX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uuX);
      }
      i = paramInt;
      if (this.uuV != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uuV);
      }
      i += b.a.a.a.fh(6, this.uuY);
      paramInt = i;
      if (this.uuZ != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uuZ);
      }
      i = paramInt;
      if (this.uva != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uva);
      }
      paramInt = i;
      if (this.uvb != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uvb);
      }
      GMTrace.o(3652869685248L, 27216);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uqN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3652869685248L, 27216);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afl localafl = (afl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3652869685248L, 27216);
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
          localafl.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 2: 
        localafl.uqM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localafl.uqN.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 4: 
        localafl.uuX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 5: 
        localafl.uuV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 6: 
        localafl.uuY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 7: 
        localafl.uuZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 8: 
        localafl.uva = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      }
      localafl.uvb = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3652869685248L, 27216);
      return 0;
    }
    GMTrace.o(3652869685248L, 27216);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\afl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */