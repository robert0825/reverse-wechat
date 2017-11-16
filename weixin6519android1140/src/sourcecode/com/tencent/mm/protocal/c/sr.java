package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class sr
  extends azh
{
  public int jWs;
  public String jWt;
  public String kBQ;
  public String mFF;
  public String mFG;
  public String mFr;
  public int uiK;
  
  public sr()
  {
    GMTrace.i(3647769411584L, 27178);
    GMTrace.o(3647769411584L, 27178);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3647903629312L, 27179);
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
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      if (this.mFr != null) {
        paramVarArgs.e(4, this.mFr);
      }
      if (this.kBQ != null) {
        paramVarArgs.e(5, this.kBQ);
      }
      paramVarArgs.fk(6, this.uiK);
      if (this.mFG != null) {
        paramVarArgs.e(7, this.mFG);
      }
      if (this.mFF != null) {
        paramVarArgs.e(8, this.mFF);
      }
      GMTrace.o(3647903629312L, 27179);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt;
      if (this.mFr != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mFr);
      }
      paramInt = i;
      if (this.kBQ != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.kBQ);
      }
      i = paramInt + b.a.a.a.fh(6, this.uiK);
      paramInt = i;
      if (this.mFG != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.mFG);
      }
      i = paramInt;
      if (this.mFF != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.mFF);
      }
      GMTrace.o(3647903629312L, 27179);
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
      GMTrace.o(3647903629312L, 27179);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      sr localsr = (sr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3647903629312L, 27179);
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
          localsr.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3647903629312L, 27179);
        return 0;
      case 2: 
        localsr.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3647903629312L, 27179);
        return 0;
      case 3: 
        localsr.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3647903629312L, 27179);
        return 0;
      case 4: 
        localsr.mFr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3647903629312L, 27179);
        return 0;
      case 5: 
        localsr.kBQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3647903629312L, 27179);
        return 0;
      case 6: 
        localsr.uiK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3647903629312L, 27179);
        return 0;
      case 7: 
        localsr.mFG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3647903629312L, 27179);
        return 0;
      }
      localsr.mFF = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3647903629312L, 27179);
      return 0;
    }
    GMTrace.o(3647903629312L, 27179);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */