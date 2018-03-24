package com.maxmpz.poweramp.player;

public interface PipelineConsts {
	
	// For getPipelineParamInt()
	// REVISIT: match PLUGIN_ID_*?
	public static final int SUBSYSTEM_PIPELINE   = 0;
	public static final int SUBSYSTEM_DSP_TH     = 1; 
	public static final int SUBSYSTEM_DECODER_TH = 2;
	public static final int SUBSYSTEM_OUTPUT     = 3; // probably change to pipeline?
	//private static final int SUBSYSTEM_DECODER    = 5;
	
	// For queueMsg()
	public static final int PLUGIN_ID_SUBSYSTEM_PIPELINE   = 0;
	public static final int PLUGIN_ID_SUBSYSTEM_DECODER_TH = 1; // NOTE: sync with NativePlguinManager.PLUGIN_ID_SUBSYSTEM_LAST
	public static final int PLUGIN_ID_SUBSYSTEM_DSP_TH     = 2;
	
	// REVISIT: better naming (prefex with P_ or PA_P_ or move to subclass, etc.
	
	public static final int PA_OUTPUT_PARAM_SAMPLE_RATE         = 1;
	public static final int PA_OUTPUT_PARAM_SAMPLE_BITS         = 2;
	public static final int PA_OUTPUT_PARAM_ANDROID_SESSION_ID  = 3;
	public static final int PA_OUTPUT_PARAM_RESTART_LATENCY_MS  = 4;
	public static final int PA_OUTPUT_PARAM_ANDROID_AUDIO_STREAM = 5;
	
	// Internal
	public static final int PA_OUTPUT_PARAM_AUDIO_IO_HANDLE     = 0x80000001;
	
	// getPipelineParamInt() SUBSYSTEM_PIPELINE
	public static final int PARAM_LAST_DECODER_IX       = 1; // Never used ATM
	public static final int PARAM_LAST_DECODER_ID       = 2;

	// getPipelineParamInt() SUBSYSTEM_DSP_TH
	// NOTE: sync with dsp_threads.h
	public static final int DSP_TH_OUTPUT_ID            = 1;
	public static final int DSP_TH_PIPELINE_LATENCY     = 2; 
	public static final int DSP_TH_OUTPUT_LATENCY       = 3;
	public static final int DSP_TH_OUTPUT_CAPS          = 4;
	public static final int DSP_TH_SAMPLE_RATE          = 5;
	public static final int DSP_TH_OUTPUT_FORMAT        = 6; // The output format from features (e.g. the target format, not actual output device format)
	public static final int DSP_TH_BUFFERS              = 7;
	public static final int DSP_TH_BUFFER_FRAMES        = 8;
	
	
	public static final int PA_OUTPUT_CAP_ALWAYS_UNITY_GAIN        = 0x0010;
	public static final int PA_OUTPUT_CAP_NO_HEADROOM_GAIN         = 0x0020;
	public static final int PA_OUTPUT_CAP_NO_EQU                   = 0x0040;
	public static final int PA_OUTPUT_CAP_FLT_EXTENDED_DYN_RANGE   = 0x0080;
	public static final int PA_OUTPUT_CAP_PAUSE_FAST_VOLUME        = 0x0100;
	public static final int PA_OUTPUT_CAP_SEEK_FAST_VOLUME         = 0x0200;
	public static final int PA_OUTPUT_CAP_TRACK_CHANGE_FAST_VOLUME = 0x0400;
	public static final int PA_OUTPUT_CAP_NEEDS_VOLUME_PROVIDER    = 0x0800;
	public static final int PA_OUTPUT_CAP_CUSTOM_MASTER_VOLUME     = 0x1000;
	
	
	// NOTE: plugininterface-internal.h
	// NOTE: used for get_options() only
	public static final int PA_OUTPUT_CAP_24BIT_NEEDS_CHECK      = 0x10000000;
	public static final int PA_OUTPUT_CAP_FORCED_UNITY_GAIN      = 0x20000000;
	// Used for caps as well
	public static final int PA_OUTPUT_CAP_OEM_VARIANT            = 0x40000000;	

}
