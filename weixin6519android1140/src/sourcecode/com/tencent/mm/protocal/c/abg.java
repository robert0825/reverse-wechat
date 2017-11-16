package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abg
  extends azh
{
  public int umI;
  public String umJ;
  public String umK;
  public int umL;
  public String umM;
  public String urF;
  public String urG;
  
  public abg()
  {
    GMTrace.i(3961838895104L, 29518);
    GMTrace.o(3961838895104L, 29518);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3961973112832L, 29519);
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
      if (this.urF != null) {
        paramVarArgs.e(2, this.urF);
      }
      paramVarArgs.fk(3, this.umI);
      if (this.umJ != null) {
        paramVarArgs.e(4, this.umJ);
      }
      if (this.umK != null) {
        paramVarArgs.e(5, this.umK);
      }
      paramVarArgs.fk(6, this.umL);
      if (this.umM != null) {
        paramVarArgs.e(7, this.umM);
      }
      if (this.urG != null) {
        paramVarArgs.e(8, this.urG);
      }
      GMTrace.o(3961973112832L, 29519);
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
      if (this.urF != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.urF);
      }
      i += b.a.a.a.fh(3, this.umI);
      paramInt = i;
      if (this.umJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.umJ);
      }
      i = paramInt;
      if (this.umK != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.umK);
      }
      i += b.a.a.a.fh(6, this.umL);
      paramInt = i;
      if (this.umM != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.umM);
      }
      i = paramInt;
      if (this.urG != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.urG);
      }
      GMTrace.o(3961973112832L, 29519);
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
      GMTrace.o(3961973112832L, 29519);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abg localabg = (abg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3961973112832L, 29519);
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
          localabg.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3961973112832L, 29519);
        return 0;
      case 2: 
        localabg.urF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3961973112832L, 29519);
        return 0;
      case 3: 
        localabg.umI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3961973112832L, 29519);
        return 0;
      case 4: 
        localabg.umJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3961973112832L, 29519);
        return 0;
      case 5: 
        localabg.umK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3961973112832L, 29519);
        return 0;
      case 6: 
        localabg.umL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3961973112832L, 29519);
        return 0;
      case 7: 
        localabg.umM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3961973112832L, 29519);
        return 0;
      }
      localabg.urG = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3961973112832L, 29519);
      return 0;
    }
    GMTrace.o(3961973112832L, 29519);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */