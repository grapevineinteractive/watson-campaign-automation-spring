package com.github.ka4ok85.wca.options;

import java.io.File;

import com.github.ka4ok85.wca.constants.FileEncoding;

public class ImportTableOptions extends AbstractOptions {
	private final String mapFile;
	private final String sourceFile;
	private FileEncoding fileEncoding = FileEncoding.UTF_8;

	public ImportTableOptions(String mapFile, String sourceFile) {
		super();
		File file = new File(mapFile);
		if (mapFile == null || mapFile == "" || file.exists() == false || file.isDirectory()) {
			throw new RuntimeException("Map File does not exist. Provided path to Map File = " + mapFile);
		}

		file = new File(sourceFile);
		if (sourceFile == null || sourceFile == "" || file.exists() == false || file.isDirectory()) {
			throw new RuntimeException("Source File does not exist. Provided path to Source File = " + sourceFile);
		}

		this.mapFile = mapFile;
		this.sourceFile = sourceFile;
	}

	public FileEncoding getFileEncoding() {
		return fileEncoding;
	}

	public void setFileEncoding(FileEncoding fileEncoding) {
		this.fileEncoding = fileEncoding;
	}

	public String getMapFile() {
		return mapFile;
	}

	public String getSourceFile() {
		return sourceFile;
	}

	@Override
	public String toString() {
		return "ImportTableOptions [mapFile=" + mapFile + ", sourceFile=" + sourceFile + ", fileEncoding="
				+ fileEncoding + "]";
	}

}
